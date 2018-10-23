package com.company;

public class Main extends Object {

    public static void main(String[] args) {
	CarType Car = new CarType(20,1.5,"Red","diesel","Passat");

        System.out.println(" rozmiar: " + Car.getSize() + " waga: " + Car.getWeight() + " kolor: "
                + Car.getColor() + " rodzaj silnika: " + Car.getEngineType() + " model: " + Car.getCarModel());

        Car.move();

    }
}
