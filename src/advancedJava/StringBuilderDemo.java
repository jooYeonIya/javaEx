package advancedJava;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println("처음" + sb.capacity());

    for (int i = 0; i < 100; i++) {
      sb.append("i");

      if (sb.capacity() > 16) {
        System.out.println(sb.capacity());
      }
    }

    String result = sb.toString();
    System.out.println("길이" + result.length());
  }
}
