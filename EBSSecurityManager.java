import java.sql.*;

public class EBSSecurityManager {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "your_db_user";
        String pass = "your_db_password";

        // SQL to lock accounts with > 3 failed attempts
        String lockSQL = "UPDATE xx_ebs_user_security SET account_status = 'LOCKED' WHERE failed_attempts > 3";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {
            
            int rowsAffected = stmt.executeUpdate(lockSQL);
            System.out.println("Security Scan Complete. Accounts Locked: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}