package advancedJava;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random r = new Random();
    System.out.println(r.nextInt(100));

    int number = (int) (Math.random() * 100) + 1;
    System.out.println(number);
  }
}
