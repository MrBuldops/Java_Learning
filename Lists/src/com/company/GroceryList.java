package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items on your list");
        for(int i = 0; i<groceryList.size(); i++)
        {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery intem" + (position+1) + "has been modified.");

    }

    public void removeGroceryItem(int position) {
        String Item = groceryList.get(position);
        groceryList.remove(Item);

    }

    public String FindItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        if(exists)
        {
            int position = groceryList.indexOf(searchItem);
            return groceryList.get(position);
        }
        return null;

    }





}
