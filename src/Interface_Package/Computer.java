package Interface_Package;

public class Computer implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("컴퓨터를 켠다.");
  }

  @Override
  public void trunOff() {
    System.out.println("컴퓨터를 끈다.");
  }

  @Override
  public void repair() {
    System.out.println("컴퓨터를 수리한다.");
  }
}
