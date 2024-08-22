package Exersise_ch06;

public class Ex5 {
  public static void main(String[] args) {
    Phone[] phones = { new Phone("오너"),
        new Telephone("워너", "점심"),
        new Smartphone("쭈니", "롤") };

    for (Phone phone : phones) {
      if (phone instanceof Smartphone) {
        Smartphone sp = (Smartphone) phone;
        sp.playGame();
      } else if (phone instanceof Telephone) {
        Telephone tp = (Telephone) phone;
        tp.autoAnswering();
      } else {
        phone.talk();
      }
    }
  }
}

class Phone {
  protected String owner;

  void talk() {
    System.out.println(owner + "가 통화중");
  }

  public Phone(String owner) {
    this.owner = owner;
  }
}

class Telephone extends Phone {
  private String when;

  void autoAnswering() {
    System.out.println(super.owner + "가 통화중이니 " + when + "에 전화 요망");
  }

  public Telephone(String owner) {
    super(owner);
  }

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }
}

class Smartphone extends Telephone {
  private String game;
  String when;

  void playGame() {
    System.out.println(super.owner + "가 " + game + " 게임 중");
  }

  public Smartphone(String owner, String game) {
    super(owner);
    this.game = game;
  }
}
