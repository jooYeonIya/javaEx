package Exersise_ch06;

public class Ex6 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    System.out.println();
    Vehicle v = c;
    v.show();
  }
}

class Vehicle {
  String color;
  int speed;

  void show() {
    System.out.println("spuer" + color + "/" + speed);
  }

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }
}

class Car extends Vehicle {
  int displacement;
  int gears;

  @Override
  void show() {
    System.out.println(displacement + "/" + gears);
  }

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
}
