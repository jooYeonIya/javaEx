package Basic;

public class MethodDemo2 {
  public static void main(String[] args) {
    oddOrEven(2);
    oddOrEven(5);
    oddOrEven(10);
  }

  // 짝수인지 홀수인지 알려주는 메소드
  public static void oddOrEven(int number) {
    System.out.println(number % 2 == 0 ? "짝수" : "홀수");
  }
}
