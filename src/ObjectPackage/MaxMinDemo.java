package ObjectPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinDemo {
  public static void main(String[] args) {
    int[] scores = {40, 30, 70, 90, 100};
    int max = findMax(scores);
    int min = findMin(scores);
    
    System.out.printf("최대값 %d 최소값 %d", max, min);
  }

  public static int findMax(int[] scores) {
    int max = scores[0];

    for (int score : scores) {
      if (max < score) {
        max = score;
      }
    }

    return max;
  }

  public static int findMin(int[] scores) {
    int min = scores[0];

    for (int score : scores) {
      if (min > score) {
        min = score;
      }
    }

    return min;
  }
}


