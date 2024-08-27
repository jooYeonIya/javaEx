package advancedJava;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup<Beer> c1 = new Cup<>();

    c1.setBeverage(new Beer());
    Beer beer = c1.getBeverage();
    System.out.println(beer.name);

    //c1.setBeverage(new Boricha());
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