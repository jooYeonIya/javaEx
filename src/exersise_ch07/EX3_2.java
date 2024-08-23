package exersise_ch07;

public class EX3_2 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 10);
    Triangle t2 = new Triangle(5,10);

    if (t1.compareTo(t2) > 0) {
      System.out.println(t1.toString());
    } else if (t1.compareTo(t2) == -1) {
      System.out.println(t2.toString());
    } else if (t1.compareTo(t2) == 0) {
      System.out.println("넓이가 같다");
    } else {
      System.out.println("비교 못 해");
    }
  }
}


