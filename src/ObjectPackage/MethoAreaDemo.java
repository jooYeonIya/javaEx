package ObjectPackage;

public class MethoAreaDemo {
  public static void main(String[] args) {
    System.out.println(Math.PI);

    Circle circle = new Circle();
    int r = circle.getRadius2();

    // 클래스 변수
    // Math.PI를 JVM의 메소드 영역에 로딩해서 사용함
    // 프로그램이 종료될 때, 클래스가 메모리에서 언로딩 될 때 메모리에서 해제됨
    double area = r * r * Math.PI;
    System.out.println(area);
  }
}
