package exersise_ch07;

public class Triangle implements Comparable{
  int width, height;

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return (int)(width * height) / 2;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Triangle) {
      Triangle t = (Triangle) o;

      int result = 0;

      if (this.getArea() < t.getArea()) result = -1;
      else if (this.getArea() > t.getArea()) result = 1;
      else result = 0;

      return result;
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "width=" + width +
        ", height=" + height +
        "넓이=" + getArea() +
        '}';
  }
}
