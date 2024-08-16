package ObjectPackage;

public class BallDemo {
  public static void main(String[] args) {
    Ball b1 = new Ball();
    System.out.println(b1.getRadius());
    System.out.println(b1.getVolume());
  }
}

class Ball {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public  double getVolume() {
    final double PI = 3.14;
    double volume = 4/3 * PI * radius * radius * radius;
    return volume;
  }
}

class Cylinder {

}

