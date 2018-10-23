package com.company;

public class Contacts {

   private String name;
   private int number;

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

  public static Contacts creatContact(String name, int phoneNumber) {
        return new Contacts(name, phoneNumber);
  }

    public void PrintContact(){
        System.out.println("name: " + this.name);
        System.out.println("number: " + this.number);
    }
}
