import java.sql.*;

public class MySQLConnect {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "lalit@lalit730295"; // apna password likho
  
        try {
            // Load Driver (optional in new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection establish
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully ✅");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Print Data
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " + rs.getString("name")
                );
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}