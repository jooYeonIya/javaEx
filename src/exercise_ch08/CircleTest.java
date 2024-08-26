package exercise_ch08;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(2);

    if (c1.equals(c2))
      System.out.println("c1과 c2는 같다");
    else
      System.out.println("c1과 c2는 다르다");

  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      Circle c = (Circle) obj;
      return this.getClass() == c.getClass();
    }
    return false;
  }
}
