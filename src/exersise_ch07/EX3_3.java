package exersise_ch07;

import java.util.Arrays;

public class EX3_3 {
  public static void main(String[] args) {
    Book b1 = new Book(15000);
    Book b2 = new Book(50000);
    Book b3 = new Book(20000);
    Book[] books = {b1, b2, b3};

    System.out.println("정렬 전");
    for (Book book : books) {
      System.out.println(book);
    }

    System.out.println("정렬 후");
    Arrays.sort(books);
    for (Book book : books) {
      System.out.println(book);
    }

  }
}

class Book implements Comparable{
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" +
        "price=" + price +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Book) {
      Book b = (Book) o;
      return this.price - b.price;
    }
    return -999999999;
  }
}
