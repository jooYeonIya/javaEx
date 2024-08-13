package Basic;

import java.util.Scanner;

public class DivideByZeroDemo {
  public static void main(String[] args) {
    // 8월 13일
//    Scanner in = new Scanner(System.in);
//    System.out.println("양수를 입력해 주세요");
//    int i = in.nextInt();
//
//    // i == 0 일 때, Exception in thread "main" java.lang.ArithmeticException: / by zero 에러 발생
//    if (i == 0) {
//      System.out.println("0은 쓸 수가 없어용");
//    } else {
//      int resulst = 5 / i;
//      System.out.printf("5 나누기 %d 는 %d 입니다", i, resulst);
//    }

//    double result = 5 / 0.0;
    // 출력: Infinity (무한대)
//    System.out.println(result);

    double result = 5 % 0.0;
    // 출력: NaN (not a number)
    System.out.println(result);

    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    System.out.println((in == in2));
    in2 = in;
    System.out.println(in == in2);



  }
}
