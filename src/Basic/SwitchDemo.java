package Basic;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {

    // 8월 14일
    // switch문

    Scanner in = new Scanner(System.in);
    int score = in.nextInt();

    String grage = "";

    // 다중 if문으로 이렇게 쓸 수 있는 것을
//    if (score == 10) {
//    grage = "A";
//    } else if (score == 9) {
//      grage = "B";
//    } else if (score == 8) {
//      grage = "C";
//    } else {
//      grage = "D";
//    }

    // switch문으로 고쳐서 쓸 수 있다
    switch (score) {
      case 10:
        grage = "A";
        break;
      case 9:
        grage = "B";
        break;
      case 8:
        grage = "C";
        break;
      default:
        grage = "D";
        break;
    }

    // 표현식 사용 가능 (실행문이 하나만 있을 경우 중괄호 생략 가능)
    switch (score) {
      case 10 ->  grage = "A";
      case 9 -> grage = "B";
      case 8 -> grage = "C";
      default -> grage = "D";
    }

    System.out.println(grage);

    // 변수값을 바로 대입할 수도 있음
    String grade2 = switch (score) {
      case 10 -> "A";
      case 9 ->  {
        yield "BB";
      }
      case 8 ->  "C";
      default -> "D";
    };

    System.out.println(grade2);

    Scanner inputDay = new Scanner(System.in);
    String day = inputDay.nextLine();
    switch (day) {
      case "mon":
      case "tue":
      case "wed":
      case "thu":
      case "fri":
        System.out.println("평일입니당");
        break;
      case "sat", "sun":
        System.out.println("주말입니당");
        break;
      default:
        System.out.println("모르는 단어입니당");
    }
  }
}
