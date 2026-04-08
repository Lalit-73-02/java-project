import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MySQLConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "lalit@lalit730295";

        try {
            // 🔹 Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 🔹 Try-with-resources for Connection
            try (Connection con = DriverManager.getConnection(url, user, password);
                 Scanner scanner = new Scanner(System.in)) {

                System.out.println("✅ Connected Successfully!");

                // 1. Create table if not exists
                try (Statement stmt = con.createStatement()) {
                    String createTableQuery = "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(50))";
                    stmt.executeUpdate(createTableQuery);
                    System.out.println("✅ Table verified.");
                }

                while (true) {
                    System.out.println("\n--- Choose an Option ---");
                    System.out.println("1. Add Student");
                    System.out.println("2. View Students");
                    System.out.println("3. Exit");
                    System.out.print("Enter choice: ");
                    
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (choice == 1) {
                        // 2. Add data with interactive input
                        System.out.print("Enter Student ID: ");
                        int sid = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter Student Name: ");
                        String sname = scanner.nextLine();

                        String insertQuery = "INSERT IGNORE INTO student (id, name) VALUES (?, ?)";
                        try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
                            pstmt.setInt(1, sid);
                            pstmt.setString(2, sname);
                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                System.out.println("✅ Data inserted successfully!");
                            } else {
                                System.out.println("⚠️ ID already exists in the database.");
                            }
                        }
                    } else if (choice == 2) {
                        // 3. View data
                        System.out.println("\n--- Student Records ---");
                        String selectQuery = "SELECT * FROM student";
                        try (Statement stmt = con.createStatement();
                             ResultSet rs = stmt.executeQuery(selectQuery)) {
                            
                            while (rs.next()) {
                                int id = rs.getInt("id");
                                String name = rs.getString("name");
                                System.out.printf("ID: %d | Name: %s%n", id, name);
                            }
                        }
                    } else if (choice == 3) {
                        System.out.println("👋 Goodbye!");
                        break;
                    } else {
                        System.out.println("❌ Invalid choice. Try again.");
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("❌ JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("❌ Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

