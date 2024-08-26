package advancedJava;

import java.io.IOException;

public class ExceptionDemo {
  public static void main(String[] args) {
    try {
      method1();
    } catch (IllegalArgumentException e) {
      throw new RuntimeException(e);
    } finally {
      System.out.println("프로그램 종료");
    }
  }

  public static void method1() throws IllegalArgumentException {
    throw new IllegalArgumentException();
  }
}
