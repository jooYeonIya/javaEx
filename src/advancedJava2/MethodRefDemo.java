package advancedJava2;

public class MethodRefDemo {
  public static void main(String[] args) {
    Mathematical m;
//    m = new Mathematical() {
//      @Override
//      public double calculate(double d) {
//        return 0;
//      }
//    };

//    m = (d) -> Math.abs(d);  이것도 길어 길어!
    m = Math::abs;
    System.out.println(m.calculate(-3.25));
  }
}

interface Mathematical {
  double calculate(double d);
}
