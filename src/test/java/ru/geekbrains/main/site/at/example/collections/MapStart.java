package ru.geekbrains.main.site.at.example.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStart {
    public static void main(String[] args) {
        Map<CarModel,String> carMap = new HashMap<>();

        carMap.put(new CarModel("Lada"), "fire");
        carMap.put(new CarModel("Toyota"), "Dream");
        carMap.put(new CarModel("KIA"), "Korea");

        System.out.println(carMap.values());
        System.out.println(carMap.get(new CarModel("Lada")));

    }
}
