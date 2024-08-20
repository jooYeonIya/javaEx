package ObjectPackage;

import java.util.Arrays;

public class ArraySearchDemo {
  public static void main(String[] args) {
    int[] numbers = {77, 88, 66, 99, 11, 22, 33};
    int findNumber = 66;
    int findIndex = -1;
    int count = 0;

    for (int i = 0; i < numbers.length; i++) {
      ++count;

      if (findNumber == numbers[i]) {
        findIndex = i;
        break;
      }
    }

    System.out.println(count);
    System.out.println(findIndex < 0 ? "찾지 못 함" : findIndex+"번째에서 찾았다");

    // 반환값이 없음 그냥 원래의 배열을 정렬함
    Arrays.sort(numbers);

    int i = Arrays.binarySearch(numbers, 77);
    System.out.println(i);
  }
}
