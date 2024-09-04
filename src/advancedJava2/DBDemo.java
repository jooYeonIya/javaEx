package advancedJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    createNewPerson(conn);
  }

  private static void createNewPerson(Connection conn) throws SQLException {
    String sql = "insert into Person (name, phone, email) values ('kang', '010-9999-9999', 'kang@a.com')";
    Statement stmt = conn.createStatement();
    int i = stmt.executeUpdate(sql);
    System.out.println(i + "개");
  }

  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/javaEx?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중");
      conn = DriverManager.getConnection(url, "root", "1234");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("드라이버 검색 오류 ");
    } catch (SQLException e) {
      System.out.println("연결 실패");
    }

    return conn;
  }
}
