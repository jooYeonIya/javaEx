package Basic;

public class OverflowDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long result = a * b;

    System.out.println(result);
  }
}
