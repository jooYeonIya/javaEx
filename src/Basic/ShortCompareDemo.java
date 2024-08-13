package Basic;

public class ShortCompareDemo {
  public static void main(String[] args) {
    String s1 = new String("hello");
    String s2 = new String("hello");

    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);;

    // null이 올 거 같은 것을 앞에 써주면 에러 발생 하지 않는다 숏트서킷
    if (s1 != null && s1.equals(s2)){
      System.out.println("문자열의 내용이 동이랍니다");
    }

    s1 = s2;
    System.out.println("동일하다" + (s1 == s2));


  }
}
