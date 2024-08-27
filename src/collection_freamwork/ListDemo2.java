package collection_freamwork;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
  public static void main(String[] args) {
    List<Integer> l = List.of(10, 20, 30);
    System.out.println(l);

    // UnsupportedOperationException 에러 발생
    // 팩토리는 불변 객체라서 (ImmutableCollections.java:142)
    // l.add(40);

    // 부품으로 팩토리 객체를 넣어서 만들면 된다
    List<Integer> integers = new ArrayList<>(l);
    integers.add(15);
    integers.add(1, 100);
    System.out.println(integers);

  }
}
