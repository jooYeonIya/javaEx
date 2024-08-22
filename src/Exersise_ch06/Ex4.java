package Exersise_ch06;

public class Ex4 {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}

class Parent {
  String name = "영조";
  void print() {

  }
}

class Child extends Parent {
  String name = "사도세자";

  @Override
  void print() {
    System.out.println(name);
  }
}