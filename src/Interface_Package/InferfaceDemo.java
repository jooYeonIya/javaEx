package Interface_Package;

public class InferfaceDemo {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Vehicle m = new Car();
    Moveale mc = new Car();

    m.Move(4);
    v.Move(10);
    mc.Move(111);

    // m.show(); 안나와용 -> 다운캐스팅하면 된다

    Car car = (Car) v;
    Car car2 = (Car) mc;

    car.show();
    car2.show();
  }
}
