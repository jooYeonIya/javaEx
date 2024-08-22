package Exersise_ch06;

public class Ex3 {
  public static void main(String[] args) {
    Person[] person = new Person[3];
    person[0] = new Person("길동이", 22);
    person[1] = new Student("황진이", 23, 100);
    person[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

    for (Person p : person) {
      System.out.println(p.show() + "]");
    }
  }
}

class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String show() {
    return "사람[이름 : "+ name +", 나이 : " + age;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Student extends Person {
  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public String show() {
    return super.show() + ", 학번 : " + number;
  }

  public Student(String name, int age, int number) {
    super(name, age);
    this.number = number;
  }
}

class ForeignStudent extends Student {
  private String national;

  public String getNational() {
    return national;
  }

  public void setNational(String national) {
    this.national = national;
  }

  @Override
  public String show() {
    return super.show() + ", 국적 : " + national;
  }

  public ForeignStudent(String name, int age, int number, String national) {
    super(name, age, number);
    this.national = national;
  }
}