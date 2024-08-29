package advancedJava2;

import java.util.Comparator;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("a1", "a2", "b1", "c1", "c2", "c3");
//    s.filter(str -> str.contains("a")).forEach(System.out::println);

    s.filter(x -> x.startsWith("c"))
        .skip(1)
        .forEach(System.out::println);

    Stream<Integer> integerStream = Stream.of(1, 12, 2, 3, 4, 3, 5, 6, 7, 8, 9, 10);
    integerStream.filter(i -> i % 2 == 0)
        .forEach(System.out::println);

    // 인구가 1억이 넘는 국가 중에서 2개만 출력하는데 인구가 큰 순서대로 출력
    Nation.nations.stream().filter(i -> i.getPopulation() > 100.0 )
        // Double에서 int로 변환할 때, 값의 손실이 발생할 수 있음
        .sorted((o1, o2) -> (int)(o2.getPopulation() - o1.getPopulation()))
        .limit(2)
        .forEach(System.out::println);

    Nation.nations.stream().filter(i -> i.getPopulation() > 100.0 )
        .sorted(Comparator.comparing(Nation::getPopulation).reversed())
        .limit(2)
        .forEach(System.out::println);

    Nation.nations.stream()
        .filter(i -> i.getPopulation() > 100.0)
        // 인구수가 같을 때 이름으로 정렬하기할 때는 이렇게 사용함
        .sorted(Comparator.comparing(Nation::getPopulation, Comparator.reverseOrder())
            .thenComparing(Nation::getName))
        .limit(2)
        .forEach(System.out::println);
  }
}
