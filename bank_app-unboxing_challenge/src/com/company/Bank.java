package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    void addBranch(String name) {
        if (IsExist(name))
            System.out.println("error: Branch already exists");
        else {
            Branch branch = new Branch(name);
            branches.add(branch);
        }
    }


    private boolean IsExist(String name) {

        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (name == branch.getName())
                return true;
        }
        return false;
    }


    void AddClientToBranch(String BranchName, String ClientName) {
        for (int i = 0; i < branches.size(); i++) {
            if (BranchName == branches.get(i).getName())
                branches.get(i).AddClient(ClientName);

        }
    }

    void AddClientTransactionToBranch(String BranchName, String ClientName, double value) {
        for (int i = 0; i < branches.size(); i++) {
            if (BranchName == branches.get(i).getName()){
                branches.get(i).addClientTransaction(value,ClientName);
            }


        }
    }



    public void PrintList(){
        for( int i = 0; i < branches.size(); i++) {
            System.out.println(branches.get(i).getName());
            branches.get(i).PrintClientsList();
        }


    }







}