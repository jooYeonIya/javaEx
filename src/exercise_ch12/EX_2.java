package exercise_ch12;

import java.util.Arrays;
import java.util.List;

public class EX_2 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", 30),
        new Member("신용권", 40),
        new Member("강자바", 26)
    );

    double avg = list.stream()
        .mapToDouble(Member::getAge)
        .average()
        .getAsDouble();

    System.out.println(avg);
  }
}

class Member {
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() { return name; }
  public int getAge() { return age; }
}