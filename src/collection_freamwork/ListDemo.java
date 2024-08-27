package collection_freamwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();

    l = new LinkedList<>();

    // 요소가 잘 들어갔는지 불린값을 반환해서 알려줌
    boolean add = l.add(100);

    l.add(0, 30);

    System.out.println(l.toString());

    System.out.println(l.get(1));
    System.out.println(l.indexOf(100));

    // 배열에서 삭제하고 삭제된 요소를 반환해줌
    Integer remove = l.remove(0);
    System.out.println(remove);

    System.out.println(l);

    // 인덱스 0번째 값을 바꾸기
    l.set(0, 20);
    System.out.println("set" + l);
  }
}
