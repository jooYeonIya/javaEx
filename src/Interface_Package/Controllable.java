package Interface_Package;

/**
 * 장비를 켜고 끄는 기능을 구현
 * 수리와 초기화 기능 구현
 */

public interface Controllable {

  void turnOn();
  void trunOff();

  default void repair() {
    show("장비를 수리한다");
  }

  static void reset() {
    System.out.println("초기화");
  }

  private void show(String s) {
    System.out.println(s);
  }

}
