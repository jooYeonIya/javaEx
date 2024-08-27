package advancedJava;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup<Beer> c1 = new Cup<>();

    c1.setBeverage(new Beer());
    Beer beer = c1.getBeverage();
    System.out.println(beer.name);

    //c1.setBeverage(new Boricha());

    CupInbeverage<Beer> cupBeer = new CupInbeverage<>();

    // 이건 안된다. 왜냐면 베버리지를 상속받은 타입이 아니니까
//    CupInbeverage<String> cupStr = new CupInbeverage<String>();
  }
}

class Cup<A> {
  private A beverage;

  public A getBeverage() {
    return beverage;
  }

  public void setBeverage(A beverage) {
    this.beverage = beverage;
  }
}

// beverage를 상속받은 타입만 사용할 수 있도록 해라
class CupInbeverage< T extends Beverage>{
}

// 인터페이스지만 extends를 써서 표현
class CupExtendsInterface<T extends Comparable>{
}