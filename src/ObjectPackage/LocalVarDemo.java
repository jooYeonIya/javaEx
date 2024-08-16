package ObjectPackage;

public class LocalVarDemo {
  // 전역 변수는 초기화 안 해도 됨
  // static을 사용할 경우에는 초기화하지 않아도 기본값이 있어서 괜찮음 (클래스 변수)
  static int count;

  // static이 없는 경우에는 해당 클래스가 인스턴스화 될 때 기본값이 초기화 됨 (그러니까 인스턴스 변수라고 하는거지)
  // 해당 클래스를 인스턴스화 하지 않으면 에러 남
  int i;

  public void printI() {
    System.out.println("print I ");
    System.out.println(i);
  }

  public static void main(String[] args) {
    System.out.println(count);
    // 지역 변수는 참조하기 전에 초기화가 되어 있어야 함
    int a = 1;
    System.out.println(a);

    for (int i = 0; i < 10 ; i++) {
      // 지역 변수랑 이름이 같으니까 사용 불가
      // int a = 1;
      System.out.println(i);
    }

    LocalVarDemo demo = new LocalVarDemo();
    demo.printI();
  }
}
