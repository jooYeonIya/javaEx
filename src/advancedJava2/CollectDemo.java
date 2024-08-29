package advancedJava2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {
  public static void main(String[] args) {
    Set<Nation.Type> collect = Nation.nations.stream()
        .map(n -> n.getType())
        .collect((Collectors.toSet()));

    for (Nation.Type type : collect) {
      System.out.println(type);
    }

    List<String> list = Nation.nations.stream()
        .map(na -> na.getName())
        .limit(3)
        .collect(Collectors.toList());

    for (String s : list) {
      System.out.println(s);
    }

    System.out.println(Nation.nations.stream()
        .filter (Nation::isIsland)
        .collect(Collectors.toMap(Nation::getName, Nation::getPopulation)));
  }
}
