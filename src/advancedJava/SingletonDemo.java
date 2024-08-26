package advancedJava;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton singleton2 = Singleton.getSingleton();

    // 같은 값(번지) 나옴 - 공통으로 사요하는 거니까
    System.out.println(singleton);
    System.out.println(singleton2);

    NotSingleton ns1 = new NotSingleton();
    NotSingleton ns2 = new NotSingleton();

    System.out.println(ns1);
    System.out.println(ns2);
  }
}

class NotSingleton {

}

class Singleton {
  private Singleton() { }

  public static Singleton singleton = new Singleton();

  static Singleton getSingleton() {
    return singleton;
  }
}