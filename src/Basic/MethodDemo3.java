package Basic;

public class MethodDemo3 {
  public static void main(String[] args) {
    int number = 0;
    int number1 = 1;

    // 더하기
    System.out.println(add(number,number1));

    // 빼기
    System.out.println(minus(number,number1));

    // 곱하기
    System.out.println(mulitply(number,number1));

    // 나누기
    System.out.println(divide(number,number1));
  }

  public static int add(int number, int number2) {
    return number + number2;
  }

  public static int minus(int number, int number2) {
    return number - number2;
  }

  public static int mulitply(int number, int number2) {
    return number * number2;
  }

  public static int divide(int number, int number2) {
    if (number2 == 0) return 0;
    return number / number2;
  }
}
