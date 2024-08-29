package advancedJava2;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
  public static void main(String[] args) {
//    Consumer<String> printX = new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//
//      }
//    };

//    Consumer<String> printX = str -> System.out.println(str);
    Consumer<String> printX = System.out::println;
    printX.accept("testesttest");

//    ObjIntConsumer<String> lengthCheeck = new ObjIntConsumer<String>() {
//      @Override
//      public void accept(String s, int value) {
//
//      }
//    };

        ObjIntConsumer<String> printItimes = (s, value) -> {
          for (int i = 0; i < value; i++) {
            System.out.println(s);
          }
        };

        printItimes.accept("test", 5);
  }
}
