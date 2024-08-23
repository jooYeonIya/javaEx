package Interface_Package;

public interface Moveale {
  void Move(int distance);
}

class Vehicle implements Moveale {

  @Override
  public void Move(int distance) {
    System.out.println("모든 탈 것은" + distance +"만큼 움직이다");
  }
}

class Car extends Vehicle {
  @Override
  public void Move(int distance) {
    System.out.println("자동차는" + distance + " 거리만큼 이동한다");
  }

  int gears;
  void show() {
    System.out.println(gears + "자동차임다");
  }
}
