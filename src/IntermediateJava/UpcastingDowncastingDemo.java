package IntermediateJava;

public class UpcastingDowncastingDemo {
  public static void main(String[] args) {
    // 이건 안 되는 거야
//    Person p = new Person();
//    Student s = (Student) p;

    // 자동 형변환, 업캐스팅
    // 업캐스팅이 선행되어야 한다.

    Student s = new Student();
    Person p = s;

    // 자기 자신이 갖고 있는 필드와 메서드는 당연히 쓸 수 있음
    p.whoami();;

    // 하지만 자식이 갖고 있는 건 쓸 수가 없어
//    p.number;
//    p.work();

    // 그러니까 다운캐스팅을 해서 사용할 수 있도록 함
    Student s2 = (Student) p;
    int number = s2.number;
    s2.work();
  }
}
