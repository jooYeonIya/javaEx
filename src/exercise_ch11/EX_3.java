package exercise_ch11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class EX_3 {
  public static void main(String[] args) {
    Map<String, Integer> map = new Hashtable<>();
    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("java", 88);

    Scanner in = new Scanner(System.in);
    String inputName = in.nextLine();

    System.out.println(map.get(inputName));
  }
}
