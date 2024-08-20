package ObjectPackage;

import java.util.Arrays;

public class CircleArrayDemo {
  public static void main(String[] args) {

    Circle[] circles = new Circle[5];
    circles[0] = new Circle(3);
    circles[1] = new Circle(4);;

    for (Circle circle : circles) {
      if (circle != null) System.out.println(circle.getArea());
      

  }
}
