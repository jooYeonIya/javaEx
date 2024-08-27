package exercise_ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class EX_1 {
  public static void main(String[] args) {
    Collection<String> animals = new ArrayList<>();

    // Collectino으로 했을 경우 이렇게 자식 타입을 갈아낄 수 있어서 더 좋다
    animals = new LinkedList<>();
    animals.add("갈매기");
    animals.add("나비");
    animals.add("다람쥐");
    animals.add("라마");

    for (String animal : animals) {
      if (animal.length() == 2) {
        System.out.println(animal);
      }
    }
  }
}

