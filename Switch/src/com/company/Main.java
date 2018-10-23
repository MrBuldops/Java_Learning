package com.company;

public class Main {

    public static void main(String[] args) {


//        int value = 1 ;
//
//        switch(value){
//
//            case 1 :
//                System.out.println("value is 1");
//                break;
//
//            case 2 :
//                System.out.println("value is 2");
//                break;
//
//
//            case 3 : case 4 : case 5 :
//                System.out.println("value is 3 or 4 or 5");
//                break;
//
//            default:
//                System.out.println("value is not 1 or 2");
//                break;
//        }

        char sw = 'd';

        switch(sw){

            case 'a' :
                System.out.println("wykryto literę A");
                break;

            case 'b' :
                System.out.println("wykryto literę B");
                break;

            case 'c' :
                System.out.println("wykryto literę C");
                break;

            case 'd' :
                System.out.println("wykryto literę D");
                break;

            case 'e' :
                System.out.println("wykryto literę E");
                break;

            default :
                System.out.println(" Nie wykryto żadnej ze znanych liter");
                break;
        }

    }
}
