package Exersise_ch06;

public class Ex2 {
  public static void main(String[] args) {
    Point p = new Point(10, 20);
    System.out.println(p.toString());

    MovablePoint mp = new MovablePoint(100, 200, 300, 400);
    System.out.println(mp.toString());
  }
}

class Point {
  private int x;
  private int y;

  @Override
  public String toString() {
    return "x좌표: " + x + "y좌표: " + y;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}

class MovablePoint extends Point {
  private int xSpeed;
  private int ySpeed;


  @Override
  public String toString() {
    return "super" +
        super.getX() +
        "super" +
        super.getY() +
        "MovablePoint{" +
        "xSpeed=" + xSpeed +
        ", ySpeed=" + ySpeed +
        '}';
  }

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }
}
