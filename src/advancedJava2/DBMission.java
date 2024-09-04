package advancedJava2;

import java.sql.*;
import java.util.Scanner;

public class DBMission {
  public static void main(String[] args) throws SQLException {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();

    Connection conn = makeConnection();
    getPersonInfos(conn, s);
  }

  private static void getPersonInfos(Connection conn, String phone) throws SQLException {
    String sql = "select * from Person where phone = ?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, phone);

    ResultSet resultSet = ps.executeQuery();

    if (!resultSet.isBeforeFirst()) {
      System.out.println("조건에 맞는게 없어용");
    } else {
      resultSet.next();
      System.out.println(resultSet.getString(1));
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
