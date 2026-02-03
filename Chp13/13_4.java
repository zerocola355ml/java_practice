import java.sql.*;

public class Source_13_4 {
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
                if(!stmt.execute("delete from book")) {
                    System.out.println(stmt.getUpdateCount() + "개의 행 삭제.");
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
