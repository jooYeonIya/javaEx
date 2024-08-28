package advancedJava2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambddaDemo2 {
  public static void main(String[] args) {
    List<Integer> abcd = Arrays.asList(1, 4, 5, 2, 3);
//    Collections.sort(abcd);
//    Collections.reverse(abcd);

//    Collections.sort(abcd, Collections.reverseOrder());

//    Collections.sort(abcd, new Comparator<Integer>() {
//      @Override
//      public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//      }
//    });

    // 위 부분을 람다식으로 바꾸면 아래처럼 나온다
    Collections.sort(abcd, (o1, o2) -> o2 - o1);


    System.out.println(abcd);
  }
}
