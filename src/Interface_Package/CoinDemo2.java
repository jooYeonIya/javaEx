package Interface_Package;

public class CoinDemo2 implements Coin, MyInterface {

  @Override
  public void sayHello() {
    System.out.println("Coin Hello");
  }

  public static void main(String[] args) {
    System.out.println(DIME);
    System.out.println(QUARTER);
  }
}
