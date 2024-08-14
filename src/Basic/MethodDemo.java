package Basic;

public class MethodDemo {
  public static void main(String[] args) {
    // 8월 14일
    // 메소드
    // 코드의 반복을 줄이고 재사용성을 높이고, 유지보수성도 높아진당!
    int sum = sum(1, 10);
    System.out.println(sum);

    int sum1 = sum(10,100);
    System.out.println(sum1);
  }

  // 두개의 숫자를 입력 받아서 strat부터 end까지 합을 구하는 메소드
  public static int sum(int i1, int i2) {
    int sum = 0;

    for (int i = i1; i <= i2; i++) {
      sum += i;
    }

    return sum;
  }
}
