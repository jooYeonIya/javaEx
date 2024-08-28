package collection_freamwork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();

    System.out.println(q.size());
    System.out.println(q.isEmpty());

    // NoSuchElementException 발생
    // q.remove();

    while (!q.isEmpty()) {
      q.remove();
    }

    q.offer("바나나");
    q.offer("수박");
    q.offer("사과");
    q.offer("토마토");

    while (!q.isEmpty()) {
      System.out.println("맨 처음에 있는 요소 " + q.peek());
      System.out.println("제거된 요소 " + q.poll());
    }
  }
}
