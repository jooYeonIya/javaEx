package ObjectPackage;

public class ArrayParamsDemo {
  public static void main(String[] args) {
    if (args.length == 1) {
      System.out.println(args[0]);
      return;
    }

    int[] x = {0};
    System.out.println("호출 전 " + x[0]);
    increment(x);
    System.out.println("호출 후 " + x[0]);
  }

  public static void increment(int[] n) {
    System.out.println("메소드 전 " + n[0]);
    n[0]++;
    System.out.println("메소드 후 " + n[0]);
  }
}
