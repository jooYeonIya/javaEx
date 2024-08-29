package advancedJava2;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("d1", "d2", "d43", "d6");
    s1.sorted()
        .forEach(System.out::println);

    Stream<Nation> n1 = Nation.nations.stream();
    n1.sorted(Comparator.comparing(Nation::getName))
        .forEach(Util::printWithParenthesis);
  }
}
