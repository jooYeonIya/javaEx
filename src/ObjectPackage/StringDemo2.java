package ObjectPackage;

public class StringDemo2 {
  public static void main(String[] args) {
    // 문자열 비교
    String s1 = "Hi java";
    String s2 = "Hi java";
    String s3 = new String("Hi java");

    // 앞에서부터 연산하기 때문에 + 를 먼저하게 됨
    // 하지만 == 비교를 해주고 싶기 때문에 ()를 사용하는 것임

    // s1에서 string pool에 번지를 하나 만들고
    // s2는 같은 번지를 사용함
    System.out.println("s1 == s2 " + (s1 == s2)); // true

    // s3는 new 생성자를 사용했기 때문에 string pool에 새롭게 번지를 만든다
    // 따라서 s1과 s3는 같다고 나오지 않는 것임
    System.out.println("s1 == s3 " + (s1 == s3)); // false

    // 그래서 문자열 비교를 할 때는 equals를 사용해주는 게 좋다 (동등 비교)
    System.out.println("s1 == s3 동일 비교 " + (s1.equals(s3)));


    String s11 = "Java";
    String s111 = "java";
    String s22 = "Code";
    String s33 = new String("html");

    System.out.println(s22.compareTo(s11)); // -7
    System.out.println(s11.compareTo(s22)); // 7
    System.out.println(s11.compareTo(s111)); // -32

    // 대소문자 무시
    System.out.println(s11.compareToIgnoreCase(s111)); // 0



    System.out.println(s11.equals(s111)); // false

    // 대소문자 무시
    System.out.println(s11.equalsIgnoreCase(s111)); // true





  }
}
