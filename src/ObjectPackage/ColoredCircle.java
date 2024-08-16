package ObjectPackage;

public class ColoredCircle {
  int r;
  String color;

  // 생성자 오버로딩
  public ColoredCircle() {
  }

  public ColoredCircle(String color) {
    this.color = (color == null || color.equals("") || color.equals(" ")) ? "white" : color;
  }

  public ColoredCircle(int r) {
    this.r = r > 0 ? r : 1;
  }

  public ColoredCircle(String color, int r) {
    // 같은 클래스 내의 생성자를 호출할 때 생성자의 첫 줄에서만 실행할 수 있다
    this(r);
    //따라서 아래에 하나 더 쓸 수는 없다
//    this(color);
//    this.r = r > 0 ? r : 1;
    this.color = (color == null || color.equals("") || color.equals(" ")) ? "white" : color;
  }
}

class ColoredCircleDemo {
  public static void main(String[] args) {
    ColoredCircle c1 = new ColoredCircle();
    System.out.println(c1.r + c1.color);

    ColoredCircle c2 = new ColoredCircle("blue");
    System.out.println(c2.r + c2.color);

    ColoredCircle c3 = new ColoredCircle(100);
    System.out.println(c3.r + c3.color);

    ColoredCircle c4 = new ColoredCircle("black", 100);
    System.out.println(c4.r + c4.color);
  }
}