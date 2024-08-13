package Basic;

public class AdderDemo {
  public static void main(String[] args) {
    int i = 0, j;
    j = i++;
    //후위연산자, 연산을 먼저 값증가를 나중에

    System.out.println(i);
    System.out.println(j);

    int x = 0, y;
//    y = ++x;
  // 전위연산자 값장가를 먼저 연산을 나중에
    x = x + 1;
    y = x;
    System.out.println(x);
    System.out.println(y
    );
  }
}
