package advancedJava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread{
  protected static boolean cont = true;
  protected Socket conntection = null;
  static ServerSocket server = null;

  public static void main(String[] args) throws IOException {
    server = new ServerSocket(5000);
    System.out.println("서버 소켓 생성");

    while (cont) {
      System.out.println("연결 대기 중");
      new Echo2Server(server.accept());
    }

    server.close();
  }

  public Echo2Server(Socket clientSocket) {
    conntection = clientSocket;
    start();
  }

  public void run() {
    BufferedReader in;
    System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");
    try {
      in = new BufferedReader(new InputStreamReader(conntection.getInputStream()));

      String msg;

      while ((msg = in.readLine()) != null) {
        System.out.println(conntection.getInetAddress());
        System.out.println("읽은 메시지 메아리 : " + msg);
      }

      in.close();
      conntection.close();
    } catch (IOException e) {
    }
  }

}
