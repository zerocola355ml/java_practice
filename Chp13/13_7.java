import java.sql.*;

public class Source_13_7 {
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
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM city limit 0, 50")) {
                ResultSetMetaData rsmd = rs.getMetaData();
                int colCount = rsmd.getColumnCount();
                for(int i = 1; i < colCount; i++) {
                    System.out.print(rsmd.getColumnName(i) + ", ");
                }
                System.out.println();

                while(rs.next()) {
                    for(int i = 1; i <= colCount; i++) {
                        switch(rsmd.getColumnType(i)) {
                            case Types.INTEGER:
                                System.out.print(rs.getInt(i) + ", ");
                                break;
                            case Types.CHAR:
                                System.out.print(rs.getString(i) + ", ");
                                break;
                        }
                    }
                    System.out.println();
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
