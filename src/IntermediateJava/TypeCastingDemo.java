package IntermediateJava;

public class TypeCastingDemo {
  public static void main(String[] args) {
    // 자동 형변환 업캐스팅되어 있는 상태
    Vehicle v = new Car();
    System.out.println(v.name);
    v.whoami(); // 오버라이딩해서
    v.move(); // <- 결국 이건 Vehicle.move(); 와 같음 각각의 객체에서 공통적으로 사용

    System.out.println("---------------------------");

    Car c = new Car();
    System.out.println(c.name);
    c.whoami();
    c.move();

    System.out.println("---------------------------");
    SportsCar s = new SportsCar();
    System.out.println(s.name);
    s.whoami();
    s.move();
    s.equal();
  }
}

class Vehicle {
  String name = "탈 것";

  void whoami() {
    System.out.println("나는 탈 것이다");
  }

  static void move() {
    System.out.println("이동하다");
  }
}

class Car extends Vehicle {
  String name = "자동차";

  @Override
  void whoami() {
    System.out.println("나는 자동차다");
  }

  // 스태틱 메소드는 상속 안되고 오버라이딩 안 됨
  static void move() {
    System.out.println("달리다");
  }
}

class SportsCar extends Vehicle {
  String name = "스포츠카";

  void equal() {
    System.out.println("나의 이름: " + this.name);
    System.out.println("부모의 이름: " + super.name);
  }

  @Override
  void whoami() {
    System.out.println("나는 스포츠카이다");
  }


  static void move() {
    System.out.println("씨이이잉 달리다");
  }
}
