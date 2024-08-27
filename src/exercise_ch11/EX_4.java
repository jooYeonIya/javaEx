package exercise_ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EX_4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Collection<Integer> scoreList = new ArrayList<>();

    int sum = 0;

    while (true) {
      System.out.print("점수를 입력하세요 : ");

      try {
        int score = in.nextInt();
        if (score < 0) {
          break;
        } else {
          scoreList.add(score);
          sum += score;
        }
      } catch (InputMismatchException e) {
        System.out.println("숫자를 입력해 주세요");
        break;
      }
    }

    System.out.println("전체 학생은 " + scoreList.size() + "명이다.");
    System.out.print("학생들 성적 : ");

    for (Integer socre : scoreList) {
      System.out.print(socre + " ");
    }

    System.out.println();
    System.out.println("전체 합계 : " + sum);

    int avg = scoreList.size() > 0 ? sum / scoreList.size() : 0;
    System.out.println("평균 : " + avg);
  }
}
