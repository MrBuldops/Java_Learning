package com.company;




 class car{

   private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }


    public String getName() {
        System.out.println("get name: " + name);
        return name;

    }

    public boolean isEngine() {
        System.out.println("engine is: " + engine);
        return engine;

    }

    public int getCylinders() {
       System.out.println("get cylinders: " + cylinders);
        return cylinders;

    }

    public int getWheels() {
        System.out.println("get wheels: " + wheels);
        return wheels;


    }
}

class BMW extends car{

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
