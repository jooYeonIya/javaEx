package ObjectPackage;

public class ColoredCircle {
  int r;
  String color;

  // 인스턴스 변수
  // 힙 영역에 객체 각각 로딩됨
  int numberOfCircles;

  // 클래스 변수(정적 변수, 스택틱 변수)는 모든 객체가 공유하기 때문에 객체가 만들어질 때마다 +1이 된다
  // 메소드 영역에 하나만 로딩되며, 모든 객체가 하나를 공유해서 사용
  static int numberOfCircles2;

  // 생성자 오버로딩
  public ColoredCircle() {
    numberOfCircles++;
    numberOfCircles2++;
  }

  public ColoredCircle(String color) {
    this();
    this.color = (color == null || color.equals("") || color.equals(" ")) ? "white" : color;
  }

  public ColoredCircle(int r) {
    this();
    this.r = r > 0 ? r : 1;
  }

  public ColoredCircle(String color, int r) {
    // 같은 클래스 내의 생성자를 호출할 때 생성자의 첫 줄에서만 실행할 수 있다
//    this(r);
    //따라서 아래에 하나 더 쓸 수는 없다
//    this(color);
    this();
    this.r = r > 0 ? r : 1;
    this.color = (color == null || color.equals("") || color.equals(" ")) ? "white" : color;
  }

  public void showStatus() {
    System.out.println(numberOfCircles + "번째 원이 생성되었읍니다");
    System.out.println(numberOfCircles2 + "번째 원이 생성되었읍니다");
  }

  public void setColor(String color) {
    this.color = color;

  }
}

class ColoredCircleDemo {
  public static void main(String[] args) {
    ColoredCircle c1 = new ColoredCircle();
    System.out.println(c1.r + c1.color);
    // 인스턴스 변수는 인스턴스화 될 때 초기화되기 때문에 처음에는 0이고 numberOfCircles++;에서 +1이 됨
    // 따라서 아래의 모든 객체들은 각각 인스턴스화할 때마다 0으로 초기화됐다가 +1이 되니까 showStatus()에서 1이 나오는 것임
    c1.showStatus();

    ColoredCircle c2 = new ColoredCircle("blue");
    System.out.println(c2.r + c2.color);
    c2.showStatus();

    ColoredCircle c3 = new ColoredCircle(100);
    System.out.println(c3.r + c3.color);
    c3.showStatus();

    ColoredCircle c4 = new ColoredCircle("black", 100);
    System.out.println(c4.r + c4.color);
    c4.showStatus();

    // c1이지만 4라고 나온다 왜냐하면 이미 객체를 4개 만들었기 때문임
    System.out.println(c1.numberOfCircles2);
  }
}