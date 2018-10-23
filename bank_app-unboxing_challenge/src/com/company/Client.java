package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;





    public Client(String name) {
        this.name = name;
        addTransaction((111));
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double value){
        transactions.add(value);

    }

    public void printTransactions(){
        for( int i = 0; i < transactions.size(); i++)
            System.out.println("        "+transactions.get(i).doubleValue());
    }





}
