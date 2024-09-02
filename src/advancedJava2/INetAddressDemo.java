package advancedJava2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class INetAddressDemo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress address = null, address1 = null;
    Scanner in = new Scanner(System.in);
    System.out.println("이름 입력");
    String url = in.nextLine();
    address = InetAddress.getByName(url);
    address1 = InetAddress.getLocalHost();
    System.out.println(address.getHostAddress());
    System.out.println(address1.getHostAddress());
  }
}
