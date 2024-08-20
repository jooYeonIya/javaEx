package ObjectPackage;

public class StringDemo {
  public static void main(String[] args) {
    // 원래는 생성자 new를 써야한다.
    String s1 = new String();
    String s2 = new String("A");

    System.out.println("\'" + s1 + "\'");
    System.out.println(s2);

    // 그런데 " " 를 썼을 때 컴파일러가 문자열 리터럴로서 생성자를 사용해서 만들어줌
    String s3 = "B";
    String s4 = s3;

    System.out.println("------------------");
    System.out.println(s3);
    System.out.println(s4);

    // s4를 다른 값으로 변경했을 때 s3와 s4는 같은 번지를 갖고 있으므로 s3도 변경된 값으로 출력되어야 하지만
    // 문자열은 불변 객체기 때문에 다르게 출력된다
    // string pool에 없으면 new 생성자로 추가하고, 있으면 만들어져 있는 번지를 사용하게 됨

    // new String("B1") 으로 string pool에 저장됨
    s4 = "B1";

    System.out.println("------------------");
    System.out.println(s3); // B
    System.out.println(s4); // B1


  }
}
