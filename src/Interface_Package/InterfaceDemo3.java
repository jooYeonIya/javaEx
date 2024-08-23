package Interface_Package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.trunOff();
    Controllable.reset();
    tv.repair();

    Computer c = new Computer();
    c.turnOn();
    c.trunOff();
    Controllable.reset();
    c.repair();

    NoteBook nb = new NoteBook();
    nb.turnOn();
    nb.trunOff();
    nb.repair();
    nb.inMyBag();
  }
}
