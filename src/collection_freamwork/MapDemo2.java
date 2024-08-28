package collection_freamwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo2 {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();

    Fruit apple = new Fruit("사과");
    fruits.put(apple, 10);

    fruits.put(new Fruit("복숭아"), 6);
    fruits.put(new Fruit("복숭아"), 6);

    System.out.println(fruits);
    System.out.println(fruits.get(apple));
  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Fruit fruit = (Fruit) o;
    return Objects.equals(name, fruit.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "name='" + name + '\'' +
        '}';
  }
}
