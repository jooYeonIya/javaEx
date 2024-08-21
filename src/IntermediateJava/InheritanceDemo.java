package IntermediateJava;

public class InheritanceDemo {
  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    tiger.eat();
    tiger.run();



    Eagle eagle = new Eagle();
    eagle.fly();

    Goldfish goldfish = new Goldfish();
    goldfish.swim();

    Animal animal = new Animal();
    animal.eat();
  }
}

// Object를 상속 받음
class Animal {
  String eye;
  String mouth;

  void eat() {
    System.out.println("먹다");
  }

  void sleep() {
    System.out.println("자다");
  }
}

class Tiger extends Animal {
  String legs;
  void run() {
    System.out.println("뛰다");
  }
}

class Eagle extends Animal {
  String wings;
  void fly() {
    System.out.println("날다");
  }
}

class Goldfish extends Animal {
  String fins;
  void swim() {
    System.out.println("헤엄치다");
  }
}