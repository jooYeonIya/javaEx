package ObjectPackage;

public class WithArrayDemo {
  public static void main(String[] args) {
    // 배열, 연속된 공간에 같은 데이터 타입을 저장
    // int scores[];
    // int[] scores = null;

    // NullPointerException
    // System.out.println(scores.length);

    int[] scores = {90, 75, 85, 75};
    int sum = 0;
    int length = scores.length;
    System.out.println(scores.length);

    // 인덱스는 0부터 시작
    System.out.println(scores[0]);

    for (int i = 0; i < length; i++) {
      System.out.println(scores[i]);
      sum += scores[i];
    }

    double result = (double) sum / length;
    System.out.println(sum);
    System.out.printf("평균값 %.2f", result);

    System.out.println();

    //
    for (int score : scores) {
      System.out.println(score);
    }
  }
}
