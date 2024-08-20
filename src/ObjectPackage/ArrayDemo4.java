package ObjectPackage;

import java.util.Scanner;

public class ArrayDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long[] prices = new long[5];
    long sum = 0;

    for (int i = 0; i < prices.length; i++) {
      long price = in.nextLong();
      prices[i] = price;
      sum += price;
    }

    System.out.println("합계" + sum);
    System.out.println("평균" + sum / (double) prices.length);
  }
}

