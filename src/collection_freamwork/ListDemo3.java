package collection_freamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3 {
  public static void main(String[] args) {
    // 배열의 특징을 고수하기 때문에 사이즈는 늘릴 수 없지만 내용은 바꿀 수 있음
    List<String> sList = Arrays.asList(new String[]{"사자", "호랑이", "곰"});
    sList.set(2, "판단");
    System.out.println(sList);

    List<String> sList2 = new ArrayList<>(sList);
    sList2.add("기린");
    System.out.println(sList2);
  }
}
