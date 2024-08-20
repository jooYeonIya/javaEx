package ObjectPackage;

public class StringDemo3 {
  public static void main(String[] args) {
    // 자주 사용하는 문자열 메소드

    String s1 = "Hello";
    String s2 = ", java";

    // 문자열의 길이
    System.out.println(s1.length());

    // 문자열 합성해서 새로운 문자열로 반환 (불변 객체기 때문에 새로 대상 객체를 수정하는게 아니라 새로운 걸 만드는 거임)
    String concat = s1.concat(s2);
    System.out.println(concat);

    // 대문자로 변경
    String upperCase = s1.toUpperCase();
    System.out.println(upperCase);

    // 인덱스부터 시작하는 문자열 반환
    System.out.println(s2.substring(2));

    // 2부터 시작해서 4까지 반환
    System.out.println(s2.substring(2, 4));


    // 자주 사용하는 정적 메서드

    // 기초 타입이나 객체를 문자열로 반환
    System.out.println(String.valueOf(1));

    String s4 = """
        hello
        java
        12345
        """;
    System.out.println(s4);

  }
}

