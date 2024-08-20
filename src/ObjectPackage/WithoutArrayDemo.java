package ObjectPackage;

public class WithoutArrayDemo {
  public static void main(String[] args) {
    int score = 90;
    String grade = "";
    if (score >= 90) grade = "A";

    int score2 = 75;
    String grade2 = "";
    if (score2 >= 90) grade2 = "A";
    else if (score2 >= 80) grade2 = "B";
    else grade2 = "C";

    int score3 = 75;
    String grade3 = "";
    if (score3 >= 90) grade3 = "A";
    else if (score3 >= 80) grade3 = "B";
    else grade3 = "C";

    int score4 = 75;
    String grade4 = "";
    if (score4 >= 90) grade4 = "A";
    else if (score4 >= 80) grade4 = "B";
    else grade4 = "C";

    System.out.println(grade);
    System.out.println(grade2);
    System.out.println(grade3);
    System.out.println(grade4);

  }
}
