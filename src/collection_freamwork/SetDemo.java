package collection_freamwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("포도", "바나나", "딸기", "사과", "블루베리", "무화과");

    HashSet<String> hashSet = new HashSet<>(set);
    hashSet.add("수박");

    System.out.println(hashSet);

    Iterator<String> iterator = hashSet.iterator();
    while ((iterator.hasNext())) {
      System.out.println(iterator.next());
    }

    // 같은 값은 추가가 안 된다
    boolean add = hashSet.add("수박");
    System.out.println(add);

  }
}
