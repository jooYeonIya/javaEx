package advancedJava2;

import javax.crypto.spec.PSource;
import java.rmi.server.UID;
import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = null;

    Optional<String> o1 = Optional.ofNullable(s1);
    Optional<String> o2 = Optional.ofNullable(s2);

    if (o2.isPresent()) {
      Util.print(o2);
    } else {
      System.out.println("값없음");
    }

    String ss = o1.isPresent() ? o1.get() : "어허";
    System.out.println(ss);

    o1.stream().filter(i -> o1.isPresent()).forEach(System.out::println);

    o1.ifPresent(Util::print);

    Util.printWithParenthesis(o2.orElse("값이없으요"));
  }
}
