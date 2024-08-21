package ObjectPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Mission2 {
  public static void main(String[] args) {
    // 학생의 점수를 입력 받아서
    // 저장하고
    // sum과 avg를 구함
    // 단, 학생의 수는 정해져 있지 않음
    // - 값을 입력하면 종료

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int score = 0;
    int sum = 0;

    while (score >= 0) {
      score = in.nextInt();
      if (score >= 0) {
        scores.add(score);
        sum += score;
      }
    }

    while (true) {
      score = in.nextInt();
      if (score < 0) break;
      scores.add(score);
      sum += score;

    }


    int avg = sum / scores.size();

    System.out.println("sum" + sum + "avg" + avg);
  }
}
