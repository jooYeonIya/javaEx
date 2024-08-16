package ObjectPackage;

class Circle {
  // 8월 16일

  // 필드 - 캡슐화 시키기 전
  int radius = 1;
  private int radius2 = 1;

  // 생성자
  // 생성자 코드가 없을 경우 컴파일러가 기본생성자를 자동으로 생성
  // 기본값을 주고 싶을 때는 이렇게 하면 됨
  public  Circle() {
    this.radius = 10;
  }

  // 물론 파라미터로 넘겨주는 것도 가능
  // 즉 생성자도 오버로딩 가능
  public Circle(int radius) {
    this.radius = radius;
  }

  // 메서드
  // 인스턴스를 생성해야 호출할 수 있는 메서드
  // 매개변수도 없고 리턴값도 없는 메서드
  public void printRadius() {
    System.out.println(radius);
  }

  // 원의 넓이를 구해서 리턴하는 메서드
  // 매개변수는 없고 리턴값이 있는 메서드 리턴 타입은 더블
  public double getArea() {
    final double PI = 3.14;
    double area = PI * radius * radius;
    return area;
  }

  public int getRadius2() {
    return radius2;
  }

  public void setRadius2(int radius2) {
    if (radius2 <= 0) {
      System.out.println("암것도 안하지롱");
    }
    this.radius2 = radius2;
  }
}
