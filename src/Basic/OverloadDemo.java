package Basic;

public class OverloadDemo {

  // 메소드 시그니처
  // 메소드 이름, 매개변수 개수, 매개변수 타입과 순서
  public static int add(int number, int number2) {
    return number + number2;
  }

  public static long add(long number, long number2) { return number + number2; }

  public static int minus(int number, int number2) {
    return number - number2;
  }

  public static long minus(long number, long number2) {
    return number - number2;
  }

  public static int multiply(int number, int number2) {
    return number * number2;
  }

  public static long multiply(long number, int number2) {
    return number * number2;
  }

  public static int divide(int number, int number2) {
    if (number2 == 0) return 0;
    return number / number2;
  }

  public static double divide(double number, int number2) {
    if (number2 == 0) return 0;
    return number / number2;
  }
}
