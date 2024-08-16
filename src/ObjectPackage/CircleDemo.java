package ObjectPackage;

public class CircleDemo {
  public static void main(String[] args) {
    // 8월 16일
    Circle circle = new Circle();
    circle.printRadius();

    circle.radius = 10;
    circle.printRadius();

    double area = circle.getArea();
    System.out.println(area);

    // private 설정한 것은 getter, setter 사용
    circle.setRadius2(100);
    System.out.println(circle.getRadius2());
  }
}
