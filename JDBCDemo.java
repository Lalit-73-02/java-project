import java.sql.*;

/**
 * Advanced Java: JDBC (Java Database Connectivity) Demo
 * 
 * NOTE: To run this, you need the MySQL Connector JAR in your project's 'lib' folder.
 */

public class JDBCDemo {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "yourpassword";

    public static void main(String[] args) {
        
        // 1. Establish Connection (using try-with-resources for auto-closing)
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to the database successfully!");

            // 2. Create Table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Users (" +
                                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                    "username VARCHAR(50), " +
                                    "email VARCHAR(50))";
            
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQL);
                System.out.println("Table 'Users' is ready.");
            }

            // 3. Insert Data using PreparedStatement (Prevents SQL Injection)
            String insertSQL = "INSERT INTO Users (username, email) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "john_doe");
                pstmt.setString(2, "john@example.com");
                pstmt.executeUpdate();
                System.out.println("Inserted a new user.");
            }

            // 4. Query Data
            String selectSQL = "SELECT * FROM Users";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {
                
                System.out.println("\nQuery Results:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("username");
                    String email = rs.getString("email");
                    System.out.printf("ID: %d | Name: %s | Email: %s%n", id, name, email);
                }
            }

        } catch (SQLException e) {
            System.err.println("JDBC Error: " + e.getMessage());
            System.err.println("Note: Make sure your MySQL server is running and the database exists.");
        }
    }
}
