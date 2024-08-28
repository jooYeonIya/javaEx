package collection_freamwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] frutis = {"포도", "바나나", "수박", "딸기"};
    List<String> list = Arrays.asList(frutis);

    // 오름차순
//    Collections.sort(list);
//    Collections.reverse(list);

    Collections.sort(list, Collections.reverseOrder());


    for (String ss : frutis) {
      System.out.println(ss);
    }

    System.out.println();

    for (String s : list) {
      System.out.println(s);
    }
  }
}
