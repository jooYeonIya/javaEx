package advancedJava2;

import java.sql.*;

public class DBDemo4 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    getPersonInfos(conn);
  }

  private static void getPersonInfos(Connection conn) throws SQLException {
    String sql = "select * from Person";

    PreparedStatement ps = conn.prepareStatement(sql);

    ResultSet resultSet = ps.executeQuery();

    while (resultSet.next()) {
      System.out.println(resultSet.getString(1));
    }
  }

  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/javaEx?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중");
      conn = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("드라이버 검색 오류 ");
    } catch (SQLException e) {
      System.out.println("연결 실패");
    }

    return conn;
  }
}
