package advancedJava;

import java.util.ArrayList;

public class GenericTestDemo {
  public static void main(String[] args) {
    // ArrayList<E> <> 안에 어떤 타입이라도 넣을 수 있도록 함
    // 확장에는 오픈되어 있고 변경에는 닫혀 있음
    ArrayList<Integer> intArray = new ArrayList<>();
    intArray.add(10);
    intArray.add(20);
    intArray.add(30);
    System.out.println(intArray);

    // 담는 건 문제가 없다
    ArrayList<Object> objectArrayList = new ArrayList<>();
    objectArrayList.add(10);
    objectArrayList.add("asdf");
    objectArrayList.add(new Any());

    // 그런데 꺼내서 쓰려고 할 때 문제가 생김
    // 타입이 object니까 타입캐스팅을 해줘야지만 제대로 쓸 수 있음
  }
}

class Any {
}