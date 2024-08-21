package ObjectPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Misson5 {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    System.out.println(name);
    System.out.println(Arrays.toString(name));

    for (int i = 0; i < 10; i++) {
      int min = 0;
      int max = 2;
      double doubleValue = Math.random() * (max - min + 1) + min;
      int index = (int) doubleValue;
      System.out.println(name[index]);
    }
  }
}

