package Interface_Package;

public class TV implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("tv를 켠다");
  }

  @Override
  public void trunOff() {
    System.out.println("티비를 끈다");
  }
}
