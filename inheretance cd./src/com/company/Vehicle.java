package com.company;

public class Vehicle {

    private double size;
    private double weight;

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

     public void move(){
         System.out.println("vehicle is moving");

    }

    public Vehicle(double size, double weight) {
        this.size = size;
        this.weight = weight;
    }
}
