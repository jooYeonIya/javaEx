package advancedJava2;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("asdf", "asdf1111", "asdfasdf");
    s.map(ss -> ss.toUpperCase())
        .forEach(System.out::println);

    Stream<Integer> i1 = Stream.of(1, 2, 3, 4, 6, 2, 1, 3, 4, 7, 12, 12, 5, 5, 87, 8, 32, 4);
    i1.map (i -> i * 2)
        .forEach(System.out::println);

    Stream<String> s2 = Stream.of("a1", "a2", "a43");
    s2.map(sss -> sss.replace("a", "b"))
        .forEach(System.out::println);
  }
}
