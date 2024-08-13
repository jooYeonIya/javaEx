package Basic;

import java.util.Scanner;

public class TernaryDemo {
  public static void main(String[] args) {
    // 8월 13일
    // 삼항연산자

    int i = 2;
    int res = i % 2;
    if (res == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }

    String result = (res == 0) ? "짝수" : "홀수";
    System.out.println(result);

    // x값을 입력 받아서
    Scanner in = new Scanner(System.in);
    // x가 0보다 크면 양수입니다, 0보다 작으면 음수입니다 라고 출력
    System.out.println(in.nextInt() >= 0 ? "양수입니다" : "음수입니다");
  }
}
