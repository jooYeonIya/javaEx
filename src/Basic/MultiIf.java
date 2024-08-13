package Basic;

import java.util.Scanner;

public class MultiIf {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = in.nextInt();

    String grage = "";

    if (score >= 90) {
//      if (score >= 95) {
//        grage = "A+";
//      } else {
//        grage = "A";
//      }
      grage = (score >= 95) ? "A+" : "A";
      
    } else if (score >= 80) {
      grage = "B";
    } else if (score >= 70) {
      grage = "C";
    } else {
      grage = "D";
    }

    System.out.println(grage);
  }
}

