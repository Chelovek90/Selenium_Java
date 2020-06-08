package ru.geekbrains.main.site.at.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListStart {
    public static void main(String[] args) {
        List<CarModel> carModelList = new ArrayList<>();

        carModelList.add(new CarModel("Lada"));
        carModelList.add(new CarModel("Toyota"));
        carModelList.add(new CarModel("KIA"));
        carModelList.add(new CarModel("KIA"));
        carModelList.add(new CarModel("Lada"));

        System.out.println();

        carModelList.forEach(System.out::println);
        System.out.println(carModelList.size());
        System.out.println(carModelList.hashCode());
        System.out.println(carModelList.contains(new CarModel("Reno")));
        System.out.println(carModelList.remove(3));
        carModelList.forEach(System.out::println);
        System.out.println(carModelList.size());
        carModelList.set(1, new CarModel("BMW"));
        carModelList.forEach(System.out::println);



    }
}
