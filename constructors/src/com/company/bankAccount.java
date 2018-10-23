package com.company;

public class bankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;




        public bankAccount(){

            this("1234",100,"noname","adress","0000");
            System.out.println("empty constructor called");
        }

        public bankAccount( String accountNumber, double balance, String name, String email, String phoneNumber){
            this.balance= balance;
            this.accountNumber= accountNumber;
            this.name= name;
            this.email= email;
            this.phoneNumber= phoneNumber;

            System.out.println("constructor with parameters called");



        }







    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void deposit(double money){
        this.balance+=money;
        System.out.println(" deposit confirmed");

    }

    public void withdraw(double money){

        if(this.balance-money < 0)
            System.out.println("not enough money on account");
        else {
            this.balance -= money;
            System.out.println(" withdraw confirmed");
        }

    }


}
