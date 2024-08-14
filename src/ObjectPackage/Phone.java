package ObjectPackage;

class Phone {
  // field
  String model;
  int price;
  private String id;
  // method
  void print() {
    System.out.println(price + "원의 모델 " + model + " 휴대폰임당");
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}

class PhoneDemo {
  public static void main(String[] args) {
    Phone iPhone11 = new Phone();
    iPhone11.model = "아이폰11";
    iPhone11.price = 100;
    iPhone11.print();

    Phone iPhone12Pro = new Phone();
//    iPhone12Pro.model = "아이폰12 프로";
//    iPhone12Pro.price = 120;
    // 값을 안 주면 0원의 모델 null 휴대폰임당 라고 출력된다
    iPhone12Pro.print();

    // private getter , setter
    Phone iPhone13 = new Phone();
    iPhone13.model = "아이폰13";
    iPhone13.price = 130;

    iPhone13.setId("아이폰의 세터 연습");

    iPhone13.print();

    System.out.println(iPhone13.getId());

  }
}