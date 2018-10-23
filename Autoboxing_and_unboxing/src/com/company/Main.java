package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

        ArrayList<Integer> tab = new ArrayList<Integer>();

        for(int i = 0 ; i<10 ; i++){
            tab.add(i);
        }

        for(int i = 0 ; i<10 ; i++){
            System.out.println("TaB: " + tab.get(i).intValue());
        }


    }
}
