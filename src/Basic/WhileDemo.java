package Basic;

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
  }
}
