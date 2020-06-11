package ru.geekbrains.main.site.at.example.collections;

import java.util.Objects;

public class Start {
    public static void main(String[] args) {
//        Object ob1 = new Object();
//        Object ob2 = ob1;
//        Object ob3 = ob1;
//
//        System.out.println(ob1.equals(ob2));

        CarModel c1 = new CarModel("vaz");
        CarModel c2 = new CarModel("vaz");

        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

