package advancedJava;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    int[] iArray = {1, 2, 3, 4, 5};
    Integer[] intArray = new Integer[5];

    // 자동 박싱
    Integer[] intArray2 = {1, 3, 5, 6, 10};
    String[] strArray = new String[5];

    System.out.println(iArray);

    // 객체(참조타입)니까 기본값이 0이 아니라 null이 나온다!
    System.out.println(Arrays.toString(intArray));

    // 자동 박싱으로 찾아준다
    System.out.println(Arrays.binarySearch(intArray2, 10));

    System.out.println(strArray);
  }
}
