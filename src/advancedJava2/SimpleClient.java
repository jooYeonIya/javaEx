package advancedJava2;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    try {
      Socket localhost = new Socket("localhost", 5000);
      OutputStream os = localhost.getOutputStream();
      ObjectOutputStream oos;
      for (int i = 0; i < 3; i++) {
        oos = new ObjectOutputStream(os);
        oos.writeObject("hi server");
        oos.flush();
      }
    } catch (Exception e) {
    }
  }
}
