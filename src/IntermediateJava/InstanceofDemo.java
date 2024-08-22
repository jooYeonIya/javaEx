package IntermediateJava;

public class InstanceofDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Army a = new Army();
    Person p = new Person();

    System.out.println(p instanceof Army); // false
    System.out.println(s instanceof Student);
    System.out.println(s instanceof Person);
    System.out.println(s instanceof Object);
    // 서로 관련이 없는 타입을 검사하면 컴파일 에러가 발생
    // 자바 컴파일러는 Student와 String 간의 관계를 알 수 없기 때문에 컴파일 에러를 발생
//    System.out.println(s instanceof String);

    downcase(s);
    downcase(a);
    downcase("asdfasdfasdfasdfasdfasdf");
  }

  private static void downcase(Object o){
    if (o instanceof Student) {
      Student s = (Student) o;
      System.out.println(s.number);
      s.work();
    }

    if (o instanceof Army) {
      Army a = (Army) o;
      System.out.println(a.name);
    }
  }
}
