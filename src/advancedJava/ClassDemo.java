package advancedJava;

import exersise_ch07.Line;

public class ClassDemo {
  public static void main(String[] args) {
    Line line = new Line(10);

    // 클래스 정보가 궁금할 때 사용
    Class<? extends Line> aClass = line.getClass();
    System.out.println(aClass.getName());
    System.out.println(aClass.getSimpleName());
    System.out.println(aClass.getTypeName());
    System.out.println(aClass.getPackage().getName());
  }
}


