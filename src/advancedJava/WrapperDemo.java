package advancedJava;

public class WrapperDemo {
  public static void main(String[] args) {
    // wkehd 박싱->객체처럼 쓸 수 있음
    Integer ic = 10;
    ic.getClass();

    int number = 10;
    // number.getClass(); 못 씀. 이건 값타입이니까

    // 명시적 언박싱
    int i = ic.intValue();

    // 자동 언박싱
    int ii = ic;
    System.out.println(i);
  }
}
