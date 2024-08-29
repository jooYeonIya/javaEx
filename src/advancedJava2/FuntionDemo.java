package advancedJava2;

import java.util.function.Function;

public class FuntionDemo {
  public static void main(String[] args) {
//    Function<String, Integer> f = new Function<String, Integer>() {
//      @Override
//      public Integer apply(String s) {
//        return 0;
//      }
//    };

    Function<String, Integer> f = s ->  s.length();
    f.apply("test");
  }
}
