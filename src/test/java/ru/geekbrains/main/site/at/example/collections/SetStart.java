package ru.geekbrains.main.site.at.example.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStart {
    public static void main(String[] args) {
        Set<CarModel> carModelSet = new HashSet<>();
        Set<CarModel> carModelSet1 = new HashSet<>();

        carModelSet.add(new CarModel("Lada"));
        carModelSet.add(new CarModel("Toyota"));
        carModelSet.add(new CarModel("KIA"));
        carModelSet.add(new CarModel("KIA"));
        carModelSet.add(new CarModel("Lada"));


        carModelSet1.add(new CarModel("Opel"));
        carModelSet1.add(new CarModel("Lada"));

        carModelSet.forEach(System.out::println);
        System.out.println("*******************");
        carModelSet1.forEach(System.out::println);
        System.out.println("*******************");
        System.out.println(carModelSet.add(new CarModel("Lada")));
        System.out.println("*******************");
        carModelSet1.forEach(System.out::println);
        System.out.println("*******************");
        carModelSet.removeAll(carModelSet1);
        carModelSet.forEach(System.out::println);




    }
}

