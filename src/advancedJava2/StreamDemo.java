package advancedJava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    // Before
    List<Integer> list = new ArrayList<>();
    List<Integer> gt10List = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(random.nextInt(30));
    }

    for (Integer i : list) {
      if (i >= 15) {
        gt10List.add(i);
      }
    }

    System.out.println(list);

    Collections.sort(gt10List);
    System.out.println(gt10List);

    // After
    list
        .stream()
        .filter(i -> i >= 15)
        .sorted()
        .forEach(i -> System.out.print(i + ":"));
  }
}
