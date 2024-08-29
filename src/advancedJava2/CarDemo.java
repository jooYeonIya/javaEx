package advancedJava2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CarDemo {
  public static void main(String[] args) {
    Car car = new Car("K3", true, 4, 10000);

    System.out.println(car);

    int count = 0;

    for (Car car1 : Car.cars) {
      if (car1.getModel().equals("소나타")) {
        System.out.println(car1);
        count++;
      }
    }

    System.out.println(count);

    // 만약 연식(age)가 같을 때는 리스트에 추가한 순서대로 출력됨 = 연식이 같을 때 먼저 입력된 게 먼저 나옴
    Collections.sort(Car.cars, (o1, o2) -> o1.getAge() - o2.getAge());
    System.out.println(Car.cars);

    Collections.sort(Car.cars, (o1, o2) -> o2.getMileage() - o1.getMileage());
    System.out.println(Car.cars);

//    Comparator<Car> modelComparator = Comparator.comparing(car1 -> car1.getModel());
    Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);
    Collections.sort(Car.cars, modelComparator);
  }
}
