import java.sql.*;

public class Source_13_1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mariadb://localhost:3306/world";
        String user = "root";
        String pass = "mariadb";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try(Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM city limit 0, 50")) {
            System.out.println(String.format("%-10s", "ID") +
                String.format("%-35s", "Name") +
                String.format("%-15s", "CountryCode") +
                String.format("%-20s", "District") +
                String.format("%-11s", "Population"));
            
            while(rs.next()) {
                System.out.print(String.format("%-10d", rs.getInt("ID")));
                System.out.print(String.format("%-35s", rs.getString("Name")));
                System.out.print(String.format("%-15s", rs.getString("CountryCode")));
                System.out.print(String.format("%-20s", rs.getString("District")));
                System.out.println(String.format("%-11d", rs.getInt("Population")));
            }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
