package advancedJava;

public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    System.out.println(i.get());

    Box<String> s = new Box<>();
    s.set("dhdhdh");
    System.out.println(s.get());
  }
}

class Box<T> {
  private T value;

  public T get() {
    return value;
  }

  public void set(T str) {
    this.value = str;
  }
}

