package com.e4developer.jsonbexample;

import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Optional;

@RestController
public class SimpleController {

    private Car makeCar() {
        Car newCar = new Car();
        newCar.make = "e4Cars";
        newCar.model = "theSensible";
        newCar.bonusFeatures = Optional.empty();
        newCar.price = 6000;
        newCar.productionDate = new Calendar.Builder().setDate(2018, 3, 3).build();
        return newCar;
    }

    @GetMapping("/car")
    public Car car() {
        Car newCar = makeCar();
        return newCar;
    }

    @PostMapping("/sendCar")
    public Car sendCar(@RequestBody Car car){
        System.out.println("original car: "+makeCar());
        System.out.println("transformed car: "+car.toString());
        System.out.println("Is the car the same? "+ car.equals(makeCar()));
        return car;
    }
}
