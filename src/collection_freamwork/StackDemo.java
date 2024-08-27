package collection_freamwork;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> list = new Stack<>();
    Stack<String> st = new Stack<>();

    System.out.println(list.isEmpty());
    System.out.println(st.empty());

    st.push("1!"); //addLast
    st.push("2!"); //addLast
    st.push("3!"); //addLast

    for (String s : st) {
      System.out.println(s);
    }

    System.out.println("==================================");

    st.pop(); //removeLast

    for (String s : st) {
      System.out.println(s);
    }

    System.out.println(st.peek()); // getLast

    System.out.println(st.search("1!") + "번째"); // 아래쪽에 있는게 숫자가 더 크다
    System.out.println(st.search("2!") + "번째");

  }
}
