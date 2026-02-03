import java.sql.*;

public class Source_13_2 {
    public static void main(String args[]) {
        String url = "jdbc:mariadb://localhost:3306/world";
        String user = "root";
        String pass = "mariadb";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        try(Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println(conn.getMetaData().getDriverName());
            System.out.println(conn.getMetaData().getDriverVersion());
            System.out.println(conn.getMetaData().getURL());
            System.out.println(conn.getMetaData().getUserName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
