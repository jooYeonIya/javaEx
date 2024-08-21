package IntermediateJava;

public class SuperConstructorDemo {
  public static void main(String[] args) {
    ColorBox c = new ColorBox(5);

  }
}

// 부모 객체를 먼저 만든 후에 자식 객체를 만듦
class Box {
  int szie;

  public Box() {}

  public Box(int size) {
    this.szie = size;
    System.out.println("부모");
  }
}

class ColorBox extends Box {
  public ColorBox(int size) {
    super(size);
    System.out.println("자식");
    this.szie = size;
    
  }
}
