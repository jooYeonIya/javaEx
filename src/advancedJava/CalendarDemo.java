package advancedJava;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();

    System.out.println(c.get(1));
    System.out.println(c.get(Calendar.YEAR));

  }
}
