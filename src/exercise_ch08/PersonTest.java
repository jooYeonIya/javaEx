package exercise_ch08;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");

    if (p1.equals(p2))
      System.out.println("p1 p2 같다");
    else
      System.out.println("p1 p2 다르다");
  }
}

class Person {
  String age;
  String name;

  public Person(String age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person p = (Person) obj;
      return this.getClass() == p.getClass();
    }

    return false;
  }
}
