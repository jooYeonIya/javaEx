package advancedJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Beverage> b = new ArrayList<>();
    b.add(new Beer());
    b.add(new Boricha());
    beTest(b);
    listTest(b);

    Beverage be = new Beverage();
    Beer beer = new Beer();
    be = beer;


    // 제네릭을 상속 받았다고 어레이리스트까지 상속 받은 것은 아니다
    ArrayList<Beer> b1 = new ArrayList<>();
    b1.add(new Beer());
    // b1.add(new Boricha());
    // b = b1;
//    beTest(b1);

    // 어레이리스트의 부모
    List<Beverage> list = new ArrayList<>();

  }

  public static void beTest(ArrayList<Beverage> b) {  }

  public static void listTest(List<Beverage> b) { }
}
