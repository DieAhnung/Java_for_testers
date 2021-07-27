package Lesson4_code.garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<>();

        Bike bike = new Bike("Ява", 20);
        Car car = new Car("Renaut", 100);

        garage.add(bike);
        garage.add(car);

        System.out.println(garage.indexOf(car));

        Car car1 = new Car("BMW", 90);
        garage.add(car1);

        Collections.sort(garage);
        System.out.println(garage);

        ArrayList<Car> carArrayList = new ArrayList<>(Arrays.asList(new Car("Renaut", 100, 12),
                new Car("BMW", 150, 15), new Car("LADA", 80, 8)));

        Collections.sort(carArrayList, new CarComparatorByValue());

        Collections.reverse(carArrayList);
        System.out.println(carArrayList);


    }
}
