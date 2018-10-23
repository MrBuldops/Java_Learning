package com.company;

public class Car extends Vehicle {

    String color;
    String engineType;

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public Car(double size, double weight, String color, String engineType) {
        super(size, weight);
        this.color = color;
        this.engineType = engineType;
    }


    public void wheelsSpinning(){

        System.out.println("Wheels are spinning");
    }

    @Override
    public void move() {
        super.move();
        wheelsSpinning();
        System.out.println("Car is moving");
    }
}
