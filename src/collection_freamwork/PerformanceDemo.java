package collection_freamwork;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    // 뒤에 넣는 건 빠르나 앞에 넣는 건 느리다
    ArrayList<Integer> arrayList = new ArrayList<>();

    // 앞뒤로 번지가 있으니까 앞에 넣으나 뒤에 넣으나 큰 차이가 없음
    LinkedList<Integer> linkedList = new LinkedList<>();

    long before = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
      arrayList.add(0, 1);
    }

    long after = System.nanoTime();

    System.out.println("array" + (before - after));

    before = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
      linkedList.addFirst(i);
    }

    after = System.nanoTime();

    System.out.println("linked" + (before - after));

  }
}
