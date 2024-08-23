package Interface_Package;

public class InterfaceDemo4 {
  public static void main(String[] args) {
    Controllable[] c = { new TV(), new Computer() };

    for (Controllable controllable : c) {
      controllable.turnOn();
      controllable.trunOff();
      controllable.repair();
    }

    Controllable.reset();
  }
}
