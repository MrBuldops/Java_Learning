package com.company;

public class Main {

    public static void main(String[] args) {
	int intValue = 5/3;
	float floatValue = 5f/3f;
	double doubleValue = 5d/3d;
        System.out.println("INT = " + intValue);
        System.out.println("FLOAT = " + floatValue);
        System.out.println("DOUBLE = " + doubleValue);


        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " funtów to " + kilograms + " kilkogramów");
    }
}
