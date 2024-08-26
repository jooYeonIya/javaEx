package advancedJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class SystemDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();

    // 데이터가 많을 때 좋고 적을 때는 비효율적일 수도 있음
    LinkedList dl = new LinkedList<>();

    long before = System.nanoTime();

    for (int i = 0 ; i < 100000 ; i++) {
      al.add(i);
    }

    long after =  System.nanoTime();
    System.out.println("arrayList 실행 시간 " + (after - before));

    before = System.nanoTime();

    for (int i = 0 ; i < 100000 ; i++) {
      dl.add(i);
    }

    after =  System.nanoTime();
    System.out.println("linkedList 실행 시간 " + (after - before));


  }
}
