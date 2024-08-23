package Interface_Package;

public interface MyInterface {
  // 인터페이스의 구조
  // 상수
  int Max = 10;

  // 추상 메서드
  void sayHello(); // 추상메서드

  // 디폴드 메서드
  default void sayGoobBey() {
    System.out.println("sayGoobBey");
  };

  // 스태틱 메서드
  static void method() {
    System.out.println("static method입니당");
  }

  // 인터페이스 내부에서만 사용 가능
  private int getMax() {
    return Max;
  }
}
