package ObjectPackage;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int [] scores = new int[]{10, 20, 30, 40, 50};
    for (int i = 0 ; i < scores.length ; i++) {
      System.out.print(scores[i] + ",");
    }

    System.out.println();

    // 배열은 불변 객체지만 배열 안에 있는 요소들은 불변 객체가 아니다
    // 따라서 배열 자체에 대해서 뭔가 설정해주는건 안 되지만 요소들은 설정해줄 수 있다
    scores = new int[10];
    for (int i = 0 ; i < scores.length ; i++) {
      scores[i] = (i + 1) * 10;;

      if (i == scores.length - 1) {
        System.out.print(scores[i]);
      } else {
        System.out.print(scores[i] + ",");
      }
    }
  }
}
