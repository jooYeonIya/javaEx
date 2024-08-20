package ObjectPackage;

import java.lang.reflect.InvocationTargetException;

public class ArrayDemo3 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};

    for (int i = 0; i < num.length; i++) {
      if (i != num.length - 1)
        System.out.println(i + ",");
      else
        System.out.println(i);
    }

    System.out.println("-----------------------------");

    // num의 크기를 5로 변경해달라는 요청

    int[] newNum = new int[5];

    // num의 값이 없을 경우에는 자동으로 0을 대입해준다
    for (int i = 0; i < num.length; i++) {
      newNum[i] = num[i];
    }

    num = newNum;
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + ",");
    }
  }
}
