package Interface_Package;

public class InterfaceDemo {
  public static void main(String[] args) {
    System.out.println(MyInterface.Max);

    C1 c1 = new C1();
    c1.sayHello();
    c1.sayGoobBey();

    MyInterface.method();
  }
}

class C1 implements MyInterface {

  @Override
  public void sayHello() {

  }
}

class C2 extends Shape {

  @Override
  void method1() {

  }

  @Override
  void getArea() {

  }
}
