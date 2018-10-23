package com.company;

//import com.sun.deploy.util.SessionState;

import java.util.ArrayList;

public class Branch {
    public String name;
    public ArrayList<Client> Clients = new ArrayList<Client>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void AddClient(String name) {
        if (IsExist(name))
            System.out.println("error: Client already exists");
        else {
            Client client = new Client(name);
            Clients.add(client);
        }
    }

    private boolean IsExist(String name) {

        for (int i = 0; i < Clients.size(); i++) {
            Client client = Clients.get(i);
            if (name == client.getName())
                return true;
            }
        return false;
    }


    public void PrintClientsList(){
        for( int i = 0; i < Clients.size(); i++) {
            System.out.println("    " + Clients.get(i).getName());
            Clients.get(i).printTransactions();
        }


    }

    public void addClientTransaction(double value,String ClientName) {
        for (int i = 0; i < Clients.size(); i++) {
            if (ClientName == Clients.get(i).getName())
                Clients.get(i).addTransaction(value);
            //System.out.println("added");

        }

    }


}