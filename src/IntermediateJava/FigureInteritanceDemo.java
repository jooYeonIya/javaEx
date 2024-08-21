package IntermediateJava;

public class FigureInteritanceDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3,3);
    double area = triangle.getArea();
    System.out.println(area);

    RectAngle rect = new RectAngle(4,4);
    System.out.println(rect.getArea());
  }
}

class Figure {
  private int poly;
  public int height;
  public int widht;


  public double getArea() {
    return 0.0;
  }
}

class Circle extends Figure {

}

class RectAngle extends Figure {

  public RectAngle(int height, int widht) {
    this.height = height;
    this.widht = widht;
  }

  @Override
  public double getArea() {
    return widht * height;
  }
}

class Triangle extends Figure {
  private int poly = 3;
  private int height;
  private int widht;

  public Triangle(int height, int widht) {
    this.height = height;
    this.widht = widht;
  }

  public Triangle(int poly) {
    this.poly = poly;
  }

  @Override
  public double getArea() {
    return (widht * height) / 2.0;
  }
}