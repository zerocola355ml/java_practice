import java.sql.*;

public class Source_13_3 {
    public static void main(String args[]) {
        String url = "jdbc:mariadb://localhost:3306/world";
        String user = "root";
        String pass = "mariadb";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        try(Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement()) {
                if(stmt.execute("SELECT * FROM book")) {
                    ResultSet rs = stmt.getResultSet();
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
