package advancedJava2;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
  public static void main(String[] args) {
//    UnaryOperator<String> addStrings = new UnaryOperator<String>() {
//      @Override
//      public String apply(String s) {
//        return "";
//      }
//    };

    UnaryOperator<String> addStrings = s -> s + "asfdasdf";
    System.out.println(addStrings.apply("tewst"));

//    BinaryOperator<String> str = new BinaryOperator<String>() {
//      @Override
//      public String apply(String s, String s2) {
//        return "";
//      }
//    };

    BinaryOperator<String> str = (s, s1) -> s + s1;
    System.out.println(str.apply("asdf", "hellowwwwwwwww"));
  }
}
