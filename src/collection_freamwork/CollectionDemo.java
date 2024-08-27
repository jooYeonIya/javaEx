package collection_freamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
  public static void main(String[] args) {
    // 부모에게 업캐스팅
    Collection<Integer> c = new ArrayList<>();

    // 가장 끝에 추가
    c.add(10);
    c.add(20);
    System.out.println(c);

    // 제거
    c.remove(10);
    System.out.println(c);

    // 포함하고 있닝?
    System.out.println(c.contains(10));

    Integer[] array = c.toArray(new Integer[c.size()]);
    System.out.println("dddddddd"+ Arrays.toString(array));

    // 객체의 개수
    System.out.println(c.size());

    // 다 지우기
    c.clear();
    System.out.println(c);

    // 비어 있는지 확인
    System.out.println(c.isEmpty());

    System.out.println("----------------");

    Collection<String> str = new ArrayList<>();
    str.add("asd");
    str.add("asd2");
    str.add("asd23");
    Iterator<String> iterator = str.iterator();
    System.out.println(iterator.next());
    System.out.println(iterator.next());
    System.out.println(iterator.next());
//    System.out.println(iterator.next()); NoSuchElementException unchecked 예외 발생

    // 다 출력한 후에는 다시 한 번 더 해줘야 한다
    iterator = str.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
