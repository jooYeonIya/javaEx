package advancedJava2;

import java.awt.*;
import java.util.Iterator;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
//    IntPredicate even  = new IntPredicate() {
//      @Override
//      public boolean test(int value) {
//        return value % 2 == 0;
//      }
//    };

    IntPredicate even = value ->  value % 2 == 0 ;
    System.out.println(even.test(3));
    System.out.println(even.test(4));

//    BiPredicate<Integer, Integer> bi = new BiPredicate<Integer, Integer>() {
//      @Override
//      public boolean test(Integer integer, Integer integer2) {
//        return false;
//      }
//    };

    BiPredicate<Integer, Integer> bi = (i, j) -> i == j ;
    System.out.println(bi.test(2,2));
    System.out.println(bi.test(2,25));

//    Predicate<Integer> p = new Predicate<Integer>() {
//      @Override
//      public boolean test(Integer integer) {
//        return false;
//      }
//    };

    Predicate<Integer> p = i -> i > 0;
    System.out.println(p.test(3));
    System.out.println(p.test(-1));
  }
}

