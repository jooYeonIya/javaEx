package advancedJava2;

public class LambdaDemo {
  public static void main(String[] args) {
    Object obj = new Object() {
      int max(int a, int b) {
        return a < b ? b : a;
      }
    };

    // obj.max(3, 5); 실행시킬 수가 없음

    MyFunction f = new MyFunction() {
      @Override
      public int max(int a, int b) {
        return a > b ? a : b;
      }
    };

    System.out.println(f.max(2,4));
  }
}

interface MyFunction {
  public abstract int max(int a, int b);
}

// 추상화가 하나만 있는 것
// 안에는 메소드가 하나만 있으어야한다
@FunctionalInterface
interface NewFunction {
  int min(int a, int b);
}