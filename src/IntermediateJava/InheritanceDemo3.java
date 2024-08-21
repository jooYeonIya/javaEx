package IntermediateJava;

public class InheritanceDemo3 {
  public static void main(String[] args) {
    Child child = new Child();
    child.method1();
    child.method2();
    child.method3();
  }
}

class Parent {
  void method1() {
    System.out.println("method1");
  }

  void method2() {
    System.out.println("method2");
  }
}

class Child extends Parent {
  // 부모 메소드 그냥 사용

  // 변경해서 사용 - 오버라이드
  // 어노테이션 - 컴파일러에게 알려줌
  @Override
  void method2() {
    System.out.println("child method2");
  }

  // 추가해서 사용
  void method3() {
    System.out.println("여기서 추가한 메소드");
  }
}
