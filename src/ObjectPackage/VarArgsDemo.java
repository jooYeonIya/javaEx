package ObjectPackage;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1);
    printSum(1, 10);
    printSum(10, 20, 30);
  }

  // 가변 개수의 인수 전달 가능
  private static void printSum(int...i) {
    int sum = 0;

    // 파라미터를 내부적으로 배열로 취급
    for (int i1 : i) {
      sum += i1;
    }

    System.out.println(sum);
  }

  // 가변 개수 인자 앞에 변수 인자 하나 추가할 수 있음 = 시작값
  private static void printsum2(int n, int...v) {  }

  // 그런데 가변 개수 뒤에 새로운 변수를 만들 순 없다 = 가변 개수가 마지막이어야 한다
//  private static void printsum3(int n, int...v, int k) {  }
}
