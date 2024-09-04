package advancedJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo2 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    changeEmail(conn);
  }

  private static void changeEmail(Connection conn) throws SQLException {
    String sql = "update Person set email = ? where phone = ?";

    // 데이터 은닉
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, "kkkk@a.com");
    ps.setString(2, "010-0000-0000");

    int i = ps.executeUpdate();

    if (i == 0) {
      System.out.println("데이터 추가 오류 ");
    } else {
      System.out.println(i + "개");
    }
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
