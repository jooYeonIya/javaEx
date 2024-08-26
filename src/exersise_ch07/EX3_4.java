package exersise_ch07;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EX3_4 {
  public static void main(String[] args) {
    Person[] person = {
        new Person("박지성", 40, 175, 68),
        new Person("홍길동", 32, 170, 75),
        new Person("손흥민", 20, 180, 70)
    };

//    Arrays.sort(person);
    Arrays.sort(person, Collections.reverseOrder());

    for (Person person1 : person) {
      System.out.println(person1);
    }
  }
}

class Person implements Comparable {
  int age, height, weight;
  String name;

  public Person(String name, int age, int height, int weight) {
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", height=" + height +
        ", weight=" + weight +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Person) {
      Person p = (Person) o;

      // 오름차순 정렬
      return this.age - p.age;
    }

    return -9999999;
  }
}
