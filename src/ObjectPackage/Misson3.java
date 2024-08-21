package ObjectPackage;

public class Misson3 {
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4));

    int[] arr = {2, 3};
    System.out.println(sum(1, arr));

    System.out.println(sum(1,2,3,4,5));
  }

  public static int sum(int n, int...number) {
    int sum = 0;

    for (int i : number) {
      sum += i;
    }

    return sum;
  }
}
