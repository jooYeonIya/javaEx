package advancedJava;

public class GenericmethodDemo {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4, 5};
    MyUtils.showArray(arr);
    System.out.println(MyUtils.getLast(arr));

    String[] sArr = {"Asdf", "asdf"};
    MyUtils.showArray(sArr);

    System.out.println("-=-=-=-=-=-=-=아래는 제네릭 메소드-=-=-=-=-=-=-=-=");

    MyUtils.showArray(arr);
    MyUtils.showArray(sArr);


    System.out.println("-=-=-=-=-=-=-=아래는 제네릭 메소드-=-=-=-=-=-=-=-=");
    System.out.println(MyUtils.getLast(arr));
    System.out.println(MyUtils.getLast(sArr));
  }
}

class MyUtils {
  // 타입별로 이렇게 비슷한 메소드를 계속 만들어줘야 한다
  public static void showArray(Integer[] iArrays) {
    for (Integer iArray : iArrays) {
      System.out.println(iArray);
    }
  }

  public static void showArray(String[] sArrays) {
    for (String sArray : sArrays) {
      System.out.println(sArray);
    }
  }

  // 하지만 제네릭 타입을 쓰면 비슷한 코드를 계속 짤 이유가 없음
  public static <T> void showArray(T[] sArrays) {
    for (T sArray : sArrays) {
      System.out.println(sArray);
    }
  }

  // 타입마다 하기 싫어~~~~
  public static Integer getLast(Integer[] a) {
    return a[a.length - 1];
  }

  // 제네릭으로 하면 되잖아!
  public static <T> T getLast(T[] a) {
    return a[a.length - 1];
  }
}
