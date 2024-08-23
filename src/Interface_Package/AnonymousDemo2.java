package Interface_Package;

public class AnonymousDemo2 {
  int innerField = 100;
  
  public static void main(String[] args) {
    Parent p = new Parent() {
      @Override
      public void callOnce() {
        System.out.println("딱 한 번만 호출");
        newMethod();;
      }

      public void newMethod() {
        System.out.println("익명객체의 새로운 메서드");
      }
    };

    p.callOnce();
  }
}
