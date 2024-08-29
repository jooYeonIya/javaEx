package advancedJava2;

import java.util.Comparator;
import java.util.Optional;

public class FindDemo {
  public static void main(String[] args) {
    Optional<Nation> any = Nation.nations.stream()
        .filter(n -> n.isIsland()).findAny();
    // 조건에 맞는게 없을 경우에는 Optional.empty가 출력된다
    System.out.println(any);
    any.ifPresent(System.out::println);

    Optional<Nation> max = Nation.nations.stream()
        .max(Comparator.comparing(n -> n.getPopulation()));

    System.out.println(max);

    long count = Nation.nations.stream()
        .filter(na1 -> na1.getPopulation() > 100)
        .count();
    System.out.println(count);
  }
}
