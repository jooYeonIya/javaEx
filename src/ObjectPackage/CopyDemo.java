package ObjectPackage;

public class CopyDemo {
  public static void main(String[] args) {
    // 8월 16일
    
    int ten = 10;
    int copyTen = ten;

    // 이 상황에서 출력은 두 개 모두 10으로 나옴
    System.out.println(ten);
    System.out.println(copyTen);


    ten = 11;
    // 이 상황에는 copyTen은 10이 나옴
    // 왜냐고?! 값을 이미 복사해둔 상태니까 (값 타입)
    System.out.println(ten);
    System.out.println(copyTen);


    Circle c1 = new Circle();
    Circle c2 = new Circle();

    System.out.println(c1.getArea());
    System.out.println(c2.getArea());

    // c2의 radius를 변경하지 않았음에도 c1의 번지를 참조하고 있기 때문에 두 개의 값은 똑같이 나온다 (참조 타입)
    // 이 때 c2의 번지는 아무도 참조하지 않기 때문에 가비지 컬렉터가 삭제
    c2 = c1;
    c1.radius = 10;

    System.out.println(c1.getArea());
    System.out.println(c2.getArea());

  }
}
