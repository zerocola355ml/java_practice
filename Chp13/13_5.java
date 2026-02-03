import java.sql.*;

public class Source_13_5 {
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
                int resultCount = stmt.executeUpdate("INSERT INTO 테이블이름 ...");
                System.out.println(resultCount + "개의 행이 삽입되었습니다.");
                resultCount = stmt.executeUpdate("UPDATE 테이블이름 SET");
                System.out.println(resultCount + "개의 행이 변경되었습니다.");
                resultCount = stmt.executeUpdate("DELETE FROM 테이블이름 ...");
                System.out.println(resultCount + "개의 행이 삭제되었습니다.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
