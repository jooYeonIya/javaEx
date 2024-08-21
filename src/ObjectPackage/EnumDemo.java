package ObjectPackage;

public class EnumDemo {
  public static void main(String[] args) {
// 열거형 상수는 같은 열거형 내에서만 비교할 수 있고, 서로 다른 열거형 간의 비교는 안 됨
    //    if (People.Gender.MALE != People.Number.ONE) {
//      System.out.println("달라 달라");
//    }

  Day dayOfWeek = Day.FRI;

  switch (dayOfWeek) {
    case MON -> System.out.println("월");
    case TUE -> System.out.println("화");
    case WED -> System.out.println("수");
    case THU -> System.out.println("목");
    case FRI -> System.out.println("금");
    case SAT -> System.out.println("토");
    case SUN -> System.out.println("일");
  }
}

class People {
  static final int MALE = 1;
  static final int FEMALE = 2;
  static final int ONE = 1;
  static final int TWO = 2;

  enum Gender { MALE, FEMALE }
  enum Number { ONE, TWO }
}
