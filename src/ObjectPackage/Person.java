package ObjectPackage;

public class Person {
  private String name;
  private int age;
  private String national;
  private String address;

  public void sayHello() {
    System.out.printf("내 이름은 %s 입니당 나이는용 %d 임당 나라는 %s 주소는 %s \n", name, age, national, address);
  }

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    if (name == null || name.equals("") || name.equals(" ")) {
      this.name = "김홍길동";
    } else {
      this.name = name;
    }
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    if (age < 0 ) {
      System.out.println("0보다 큰 숫자 넣어주셈");
    } else {
      this.age = age;
    }
    return this;
  }

  public String getNational() {
    return national;
  }

  public Person setNational(String national) {
    if (national == null || national.equals("") || national.equals(" ")) {
      this.national = "기본 나라";
    } else {
      this.national = national;
    }
    return this;
  }

  public String getAddress() {
    return address;
  }

  public Person setAddress(String address) {
    if (address == null || address.equals("") || address.equals(" ")) {
      this.address = "기본 주소";
    } else {
      this.address = address;
    }
    return this;
  }
}

class PersonDemo {
  public static void main(String[] args) {
    Person p = new Person();
    p.setAge(100);
    p.setName("테스트 김");
    p.setAddress("아시 아이구 아이동동");
    p.setNational("몰라");
    p.sayHello();

    Person p2 = new Person();
    // setter의 반환값이 클래스 그 자체고 return this를 해주면 연속 호출 가능
    p2.setAge(50).setName("테스트박박박박!!").setAddress("").setNational("");
    p2.sayHello();
  }
}