package ObjectPackage;

import java.util.Scanner;

public class Misson4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      String s = in.nextLine();
      String sLow = s.toLowerCase();

      if (s.equals("bye")) break;

      if (sLow.contains("java")) System.out.println(s + "은 \'java\'를 포함합니다");
      if (sLow.endsWith("com")) System.out.println(s + "은 \'com\'으로 끝납니다");
    }
  }
}
