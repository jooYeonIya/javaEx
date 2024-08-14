package Basic;

public class ForDemo {
  public static void main(String[] args) {
    // 8월 14일
    // 반복문 for문

    for (int i = 0; i < 5; i++) {
//      System.out.println((i + 1) + "번째 hello world");
      System.out.printf("%d번째 hello world \n", i);
    }

    // 중첩for문
    // 구구단
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
      System.out.println();
    }
  }
}
