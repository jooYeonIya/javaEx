package exercise_ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class EX_2 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 35));

    Iterator<Person> iterator = set.iterator();
    while (iterator.hasNext()) {
      Person next = iterator.next();
      System.out.println(next.name + next.age);
    }
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }


  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public boolean equals(Object o) {

    if (o != null && o instanceof Person) {
      Person p = (Person) o;
      return (this.age == p.age) && (this.name == p.name);
    }

    return false;

  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
