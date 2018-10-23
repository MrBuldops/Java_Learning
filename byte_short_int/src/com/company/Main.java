package com.company;

public class Main {

    public static void main(String[] args) {

        //int ma szerokosc 32
        int MinValue = -2_147_483_648;
        int MaxValue =  2_147_483_647;
        int total = (MinValue/2);
        System.out.println("total = " + total);

        // byte ma szerokosc 8
        byte myByte = -128;
        byte total2 = (byte)(myByte/2);
        System.out.println("total2 = " + total2);

        // short ma szeerokosc 16
        short myShort = 32767;
        short total3  = (short)(myShort/2);
        System.out.println("total3 = " + total3);
        // long ma szerokosc 64
        long myLongValue = 100L;

        long SuperSum = 50000L + 10L * (total +total2 + total3 );
        System.out.println("Super Sum = " + SuperSum);


    }
}
