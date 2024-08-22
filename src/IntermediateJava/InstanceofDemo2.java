package IntermediateJava;

public class InstanceofDemo2 {
  public static void main(String[] args) {
    Circle2 c1 = new Circle2(2);
    Circle2 c2 = new Circle2(4);
    Circle2 c3 = new Circle2(2);

    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
  }
}

class Circle2 {
  int radius;

  public Circle2(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) { // 오버라이딩할 때는 메소드 시그니처를 변경하면 안된다
    // 매개변수가 object 니까 circle2가 아니더라도 사용할 수 있기 때문에 타입을 한 번 확인해주는게 좋다
    if (obj instanceof Circle2) {
      // 메소드 실행시킬 때 object로 업캐스팅되어 있음
      // Circle2의 필드를 사용하기 위해서는 Circle2로 다운캐스팅해줄 필요가 있음 (되돌리기)
      Circle2 circle2 = (Circle2) obj;
      return this.radius == circle2.radius;
    }
    return false;
  }
}
