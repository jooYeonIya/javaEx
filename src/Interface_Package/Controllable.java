package Interface_Package;

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
