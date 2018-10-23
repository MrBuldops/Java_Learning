package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        while (count != 5) {
            System.out.println(count);
            count++;
        }


        int count1 = 0;
        int number =5;
        int finshNumber = 100;
        while (number<= finshNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println("Even number: " + number);
            number++;
            count1++;

            if(count1>=5)
                break;

        }

        System.out.println("**** znaleziono " + count1 + " liczb parzystych ****");



    }






    public static boolean isEvenNumber(int n) {

        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
}
}