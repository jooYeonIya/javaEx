package Basic;

public class SumDemo {
  public static void main(String[] args) {
    // 8월 14일
    // 1부터 10까지의 합을 구하기
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      sum += i;
    }

    System.out.println(sum);

    // 10부터 100까지
    sum = 0;

    for (int i = 10; i <= 100; i++) {
      sum += i;
    }

    System.out.println(sum);

    // 100부터 1000까지
    sum = 0;

    for (int i = 100; i <= 1000; i++) {
      sum += i;
    }

    System.out.println(sum);

    sum = 0;

    // 1부터 100까지, 3의 배수의 총합을 구하라
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
    }

    System.out.println(sum);

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
