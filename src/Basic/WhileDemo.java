package Basic;

import java.util.Scanner;

public class WhileDemo {
  public static void main(String[] args) {
    // 8월 14일
    // while문

    int i = 0;

    while (i <= 3) {
      System.out.println("덥다더워 반복");
      i++;
    }

    int count = 1;

    while (true) {
      if (count > 3) {
        break;
      } else {
        System.out.println(count);
        count++;
      }
    }


    Scanner in = new Scanner(System.in);
    int money = 0;

    Outter: while (true) {
      System.out.println("1.예금 2.출금 3.잔금 4.종료");

      int number = in.nextInt();

      switch (number) {
        case 1 -> {
          System.out.println("금액");
          int inputMoney = in.nextInt();
          money += inputMoney;
          System.out.println(money);
        }
        case 2 -> {
          System.out.println("금액");
          int inputMoney = in.nextInt();
          money -= inputMoney;
          System.out.println(money);
        }
        case 3 -> {
          System.out.println(money);
        }
        default -> {
          System.out.println("종료");
          break Outter;
        }
      }
    }
  }
}
