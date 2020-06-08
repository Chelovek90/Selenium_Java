package ru.geekbrains.main.site.at.example.collections;

import java.util.Objects;

class CarModel {
    private String model;

    public CarModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarModel)) return false;
        CarModel carModel = (CarModel) o;
        return model.equals(carModel.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                '}';
    }
}
