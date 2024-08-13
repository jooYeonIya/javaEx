package Basic;

import java.util.Scanner;

public class InputDemo {
  public static void main(String[] args) {
    // 8월 13일
    // 키보드로부터 받을거야 System.in
    Scanner in = new Scanner(System.in);
    System.out.println("정수형 숫자 하나를 입력하셈");
    String s = in.nextLine();
    int num = Integer.parseInt(s);
    System.out.printf("당신이 입력한 숫자는 %d 이고 100을 더한 결과는 %d입니다", num, num + 100);
  }
}
