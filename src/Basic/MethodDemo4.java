package Basic;

public class MethodDemo4 {
  public static void main(String[] args) {
    int number = 2; int number1 = 3;

    long long1 = 1_000_000_000_000L; long long2 = 2_000_000_000_000L;

    // 더하기
    System.out.println(add(number, number1));
    System.out.println(longAdd(long1, long2));

    // 빼기
    System.out.println(minus(number, number1));
    System.out.println(longMinus(long1, long2));

    // 곱하기
    System.out.println(multiply(number, number1));
    System.out.println(longMultiply(number, number1));

    // 나누기
    System.out.println(divide(number, number1));
    System.out.printf("%.4f", doubleDivide(number, number1));
  }

  public static int add(int number, int number2) {
    return number + number2;
  }

  public static long longAdd(long number, long number2) { return number + number2; }

  public static int minus(int number, int number2) {
    return number - number2;
  }

  public static long longMinus(long number, long number2) {
    return number - number2;
  }

  public static int multiply(int number, int number2) {
    return number * number2;
  }

  public static long longMultiply(int number, int number2) {
    return (long) number * number2;
  }

  public static int divide(int number, int number2) {
    if (number2 == 0) return 0;
    return number / number2;
  }

  public static double doubleDivide(int number, int number2) {
    if (number2 == 0) return 0;
//    double doubleNumber = (double) number;
//    double doubleNumber2 = (double) number2;
//    return doubleNumber / doubleNumber2;
    // 한 쪽만 타입변환을 하면 더 큰 쪽으로 자동형변환을 해준다
    return (double) number / number2;
  }
}
