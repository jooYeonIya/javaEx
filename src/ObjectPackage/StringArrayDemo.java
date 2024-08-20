package ObjectPackage;

import java.util.Arrays;

public class StringArrayDemo {
  public static void main(String[] args) {
    String[] names = new String[3];

    // 초기값 대입 안 하면 null이 기본값으로 들어간다
    System.out.println(Arrays.toString(names));

    names[0] = "HONG GIL-DONG";
    names[1] = "이철수";
    names[2] = "박철수";

    System.out.println(Arrays.toString(names));

    for (String name : names) {
      System.out.println(name.length());
    }
  }
}
