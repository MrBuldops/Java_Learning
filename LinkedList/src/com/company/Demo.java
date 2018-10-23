package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> PlacesToVisit = new LinkedList<String>();
        addInOrder(PlacesToVisit, "Sydney");
        addInOrder(PlacesToVisit, "Melbourne");
        addInOrder(PlacesToVisit, "Brisbane");
        addInOrder(PlacesToVisit, "Perth");
        addInOrder(PlacesToVisit, "Canberra");
        addInOrder(PlacesToVisit, "Darwin");

        printList(PlacesToVisit);
        visit(PlacesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("********************************");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparsion = stringListIterator.next().compareTo(newCity);
            if (comparsion == 0) {
                //equal, do not add
                System.out.println((newCity + "is already included as a destination"));
                return false;
            } else if (comparsion > 0) {
                //new City should appear before this one
                //brisbone -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparsion < 0) {
                //move to next city
            }


        }
        stringListIterator.add(newCity);
        return true;

    }


    private static void visit(LinkedList cities){
        Scanner scanner  = new Scanner(System.in);
        boolean quit = false;
        boolean goForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("no cities in itenerary");
            return;
        }else {

            System.out.println("Now visiting " + listIterator.next());
            PrintMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("holiday is over!");
                    quit = true;
                    break;
                case 1:
                    if(!goForward) {
                        listIterator.next();
                        goForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("We are now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of list");
                        goForward = false;
                    }
                    break;
                case 2:
                    if(goForward) {
                        listIterator.previous();
                        goForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("We are now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of list");
                    }
                    break;
                case 3:
                    PrintMenu();
                    break;
            }
        }
    }


    private static void PrintMenu(){
        System.out.println("Available actions \npress:");
        System.out.println("1- quit\n" +
                            "2- go to next city\n" +
                            "3- go to previous city\n" +
                            "4- print menu");

    }



}
