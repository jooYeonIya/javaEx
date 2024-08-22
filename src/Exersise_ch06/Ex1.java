package Exersise_ch06;

public class Ex1 {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    c.show();

    ColoredCircle cc = new ColoredCircle(10, "빨간색");
    cc.show();
  }
}

class Circle {
  int radius;

  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }

  public Circle(int radius) {
    this.radius = radius;
  }
}

class ColoredCircle extends Circle {
  String color;

  @Override
  void show() {
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
  }

  public ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }
}
