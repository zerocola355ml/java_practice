import java.sql.*;

public class Source_13_6 {
    static PreparedStatement getPS(PreparedStatement ps, int order, int value) {
        try {
            ps.setInt(order, value);
        } catch (Exception e) {}
        return ps;
    }

    public static void main(String args[]) {
        String url = "jdbc:mariadb://localhost:3306/world";
        String user = "root";
        String pass = "mariadb";
        String query = "SELECT * FROM city WHERE population > ?";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        try(Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = getPS(ps, 1, 9000000).executeQuery()) {
                System.out.println(
                    String.format("%-10s", "ID") +
                    String.format("%-35s", "NAME") +
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
