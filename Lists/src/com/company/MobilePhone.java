package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> contacts ;
    Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.contacts =new  ArrayList<Contacts>();;
    }

    public void printList() {
        System.out.println("Your contact list: ");

        if(contacts.size() > 0 ) {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
        else
            System.out.println("You have no contacts on your list");
    }

    public boolean addContact(Contacts contact) {

        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts newContact, Contacts oldContact) {
        int foundPosition = findContact(oldContact);
                if(foundPosition < 0){
                    System.out.println("Contact is already on file");
                    return false;
                }
        this.contacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;

    }

    private int findContact(Contacts contact){
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0; i < this.contacts.size(); i++){
            Contacts contact = this.contacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }


    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public void Menu(){

        while(true) {
            PrintMenuList();
            ChooseFromMenu();
        }

    }

    public boolean removeContact(Contacts contact){
        if(findContact(contact.getName()) < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        contacts.remove(contact);
        System.out.println(contact.getName() + " was deleted");
        return true;

    }



    public void PrintMenuList(){
        System.out.println("\n1. Quit");
        System.out.println("2. Print list of contacts");
        System.out.println("3. Add new contact");
        System.out.println("4. Update existing contact");
        System.out.println("5. Remove contact");
        System.out.println("6. Find contact");
    }

    public void ChooseFromMenu(){
        int option;
        System.out.println("\nChoose option (type number):")
        option = Integer.valueOf(scanner.nextLine());

        switch (option) {

            case 1:
                System.out.println("bye bye");
                System.exit(0);
                break;

            case 2:
                printList();

                break;

            case 3:
                addNewContact();
                break;

            case 4:
                updateContact();
                break;

            case 5:
                removeContact();
                break;

            case 6:
                queryContact();
                break;
        }
    }

    public static void startPhone(){
        System.out.println("Starting phone....");
    }

    private  void addNewContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println(("Enter phone number: "));
        int number = scanner.nextInt();
        Contacts newContact = Contacts.creatContact(name, number);
        if(addContact(newContact))
            System.out.println("Contact added successfully");
        else
            System.out.println("error");

    }

    private  void UpdateContact(){
        System.out.println("Enter name of contact which you want update: ");
        String name = scanner.nextLine();

        if(findContact(name)>0) {


            if (addContact(updateContact()))
                System.out.println("Contact added successfully");
            else
                System.out.println("error");
        }
    }

}
