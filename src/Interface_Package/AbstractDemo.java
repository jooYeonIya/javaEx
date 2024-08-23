package Interface_Package;

public class AbstractDemo {
  Circle c = new Circle();
}

abstract class Shape {
  abstract void method1();

  abstract void getArea();
}

class Circle extends Shape {
  void method1() {

  }

  void getArea() {

  }
}
