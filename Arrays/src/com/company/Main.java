package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	    int[] tab = new int[4];

        GetInt(tab);
        int[] sort= SortArray(tab);
        PrintArray(tab);
        PrintArray(sort);



    }






    static public void GetInt(int[] array){
        Scanner scan = new Scanner(System.in);

        for (int n = 0; n < array.length; n++){
            array[n] = scan.nextInt();
        }
    }

    static public void PrintArray(int[] array){

        for (int n = 0; n < array.length; n++){
            System.out.println(n + " element of array is " + array[n]);
        }
        System.out.println("\n************\n");
    }

    static public int[] SortArray(int[] array){
        int[] temp1 = new int[array.length];

        for (int n = 0; n < array.length; n++)
            temp1[n] = array[n];
            int temp;
        for (int n = 0; n < temp1.length; n++) {
            for (int m = 0; m < array.length; m++) {
                if (temp1[m] > temp1[n]) {
                    temp = temp1[m];
                    temp1[m] = temp1[n];
                    temp1[n] = temp;
                }
            }
        }
        return temp1;
    }




}
