package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank();
        bank.addBranch("Taxes");
        bank.addBranch("Transfers");
        bank.addBranch("Inside Transfers");
        bank.AddClientToBranch("Taxes","Tomek");
        bank.AddClientToBranch("Transfers","Tomek");
        bank.AddClientToBranch("Inside Transfers","Tomek");
        bank.AddClientToBranch("Inside Transfers","AmberGold");
        bank.AddClientToBranch("Transfers","AmberGold");
        bank.AddClientToBranch("Taxes","Rychu Peja");
        bank.AddClientTransactionToBranch("Taxes","Tomek",123);
        bank.AddClientTransactionToBranch("Taxes","Tomek",1222);
        bank.AddClientTransactionToBranch("Taxes","Tomek",452);
        bank.AddClientTransactionToBranch("Transfers","Tomek",45345);
        bank.AddClientTransactionToBranch("Inside Transfers","Tomek",45);
        bank.AddClientTransactionToBranch("Taxes","Rychu Peja",9000);
        bank.AddClientTransactionToBranch("Taxes","Rychu Peja",1278);

        for(int i =20000 ;i<30000; i= i + 2000) {
            bank.AddClientTransactionToBranch("Transfers", "AmberGold", i);
            bank.AddClientTransactionToBranch("Inside Transfers", "AmberGold", i * 1.5);
        }

        bank.PrintList();



    }
}
