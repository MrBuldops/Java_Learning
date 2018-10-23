package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Customer customer = new Customer("Tomek",69.99);
      Customer anotherCustomer;
      anotherCustomer = customer;
      anotherCustomer.setBalance(99.69);
      System.out.println("balance for customer " + customer.getName() + "is" + customer.getBalance());

        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);

        for(int i = 0; i< intlist.size(); i++){
            System.out.println(i + ": " + intlist.get(i));
        }

        intlist.add(1,2);

        for(int i = 0; i< intlist.size(); i++){
            System.out.println(i + ": " + intlist.get(i));
        }

    }
}
