package advancedJava;

public class CheckedDemo {
  public static void main(String[] args) { //throws InterruptedException {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
