package exersise_ch07;

public abstract class Controller {
  boolean power;
  void show() {
    String name = getName();
    String onOff = power ? "가 켜졌습니다" : "가 꺼졌습니다";
    System.out.println(name + onOff);
  }
  abstract String getName();
}

class TV extends Controller {
  public TV(boolean power) {
    this.power = power;
  }

  @Override
  String getName() {
    return "TV";
  }
}

class Radio extends Controller {

  public Radio(boolean power) {
    this.power = power;
  }

  @Override
  String getName() {
    return "Radio";
  }
}