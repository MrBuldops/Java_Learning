package com.company;

public class VipAccount {

    private String name;
    private double limit;
    private String emial;

    public VipAccount(){

        this.name = "noname";
        this.limit = 999999999;
        this.emial = "emial@email.com";

    }

    public VipAccount(String name, double limit){

        this.name = name;
        this.limit = limit;

    }

    public VipAccount(String name, double limit, String email) {

        this.name = name;
        this.limit = limit;
        this.emial = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmial() {
        return emial;
    }
}
