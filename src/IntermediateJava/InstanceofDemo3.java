package IntermediateJava;

public class InstanceofDemo3 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10,1);
    Triangle t2 = new Triangle(2,5);
    Triangle t3 = new Triangle(3,4);

    System.out.println("instanceof 활용");
    System.out.println(t1.equals(t2));
    System.out.println(t1.equals(t3));
  }
}
