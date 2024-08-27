package advancedJava;

public class GenericDemo3 {
  public static void main(String[] args) {
    Entry<String, Integer> e = new Entry<>("김선달", 20);
    Entry<String, String> e2 = new Entry<>("기타", "등등");
    Entry<Integer, String> e3 = new Entry<>(20, "등등");

    System.out.println(e.getName() + e2.getAge());

  }
}

class Entry<K, V> {
  private K name;
  private V age;

  public Entry(K name, V age) {
    this.name = name;
    this.age = age;
  }

  public K getName() {
    return name;
  }

  public void setName(K name) {
    this.name = name;
  }

  public V getAge() {
    return age;
  }

  public void setAge(V age) {
    this.age = age;
  }
}