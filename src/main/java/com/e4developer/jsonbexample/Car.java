package com.e4developer.jsonbexample;

import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class Car {
    public String make;
    public String model;
    public int price;
    public Calendar productionDate;
    public Optional<String> bonusFeatures;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                ", bonusFeatures=" + bonusFeatures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(productionDate, car.productionDate) &&
                Objects.equals(bonusFeatures, car.bonusFeatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price, productionDate, bonusFeatures);
    }
}
