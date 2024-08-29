package exercise_ch12;

import java.util.Arrays;
import java.util.List;

public class EX_1 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "이것은 자바 책이다",
        "람다식",
        "자바8은 람다식을 지원한다"
    );

    list.stream()
        .filter(s -> s.contains("자바"))
        .forEach(System.out::println);
  }
}
