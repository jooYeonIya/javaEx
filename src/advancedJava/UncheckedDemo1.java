package advancedJava;

import java.util.StringTokenizer;

public class UncheckedDemo1 {
  public static void main(String[] args) {
    String s = "tiem tis money";
    StringTokenizer st = new StringTokenizer(s);
    System.out.println(st.nextElement());
    System.out.println(st.nextElement());
    System.out.println(st.nextElement());
    System.out.println(st.nextElement()); // 여기서 예외 발생 컴파일러는 체크하지 않음(언체크)
  }
}
