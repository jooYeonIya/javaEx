package exercise_ch08;

import java.util.Random;

public class DiceTest {
  public static void main(String[] args) {
    System.out.println(new Dice().roll());
    System.out.println(new Dice2().roll());
  }
}

class Dice {
  public int roll() {
    return (int) (Math.random() * 6) + 1;
  }
}

class Dice2 {
  public int roll() {
    Random r = new Random();
//    return r.nextInt(7) + 1;
    return r.nextInt(1, 7);


    
  }
}