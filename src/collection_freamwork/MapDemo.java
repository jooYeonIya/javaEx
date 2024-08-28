package collection_freamwork;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> map = Map.of("딸기", 5, "바나나", 3, "무화과", 1);
    HashMap<String, Integer> hm = new HashMap<>(map);
    System.out.println(hm.size());
    System.out.println(hm.get("딸기"));

    hm.put("수박", 5);
    System.out.println(hm.size());
    System.out.println(hm.get("수박"));
  }
}
