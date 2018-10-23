package com.company;

public class CarType extends Car {

private String CarModel;


    public CarType(double size, double weight, String color, String engineType, String carModel) {
        super(size, weight, color, engineType);
        CarModel = carModel;
    }

    public String getCarModel() {
        return CarModel;
    }
}
