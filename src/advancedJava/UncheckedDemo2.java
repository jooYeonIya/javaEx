package advancedJava;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    int[] arat = {1, 3, 3};
    System.out.println(arat[3]);
    try {
      System.out.println(arat[3]);
    } catch (ArrayIndexOutOfBoundsException) {
      System.out.println("인덱스를 범이ㅜ를 벗어남");
    } catch {
      System.out.println("정상적으로 실행");
      System.out.println("0으로 나눌 수 덦습니담");
    };

//    System.out.println(array2[3]); //nullPointer 예외

  }
}
