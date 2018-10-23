package com.company;

public class Burger {

    private String name;
    private double price;
    private double addprice = 0.5;
    private String meat;
    private String breadroll;
    //private String addition1;
    private String[] additons = new String[6];
    private int addnum=0;

    public Burger() {
        this.name = "Classic One";
        this.price = 4;
        this.meat = "beef";
        this.breadroll = "wheat";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAddprice() {
        return addprice;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadroll() {
        return breadroll;
    }

    public String[] getAdditons() {
        return additons;
    }

    public int getAddnum() {
        return addnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadroll(String breadroll) {
        this.breadroll = breadroll;
    }

    public void setAdditons(String[] additons) {
        this.additons = additons;
    }

    public void setAddnum(int addnum) {
        this.addnum = addnum;
    }

    public void AddAdditon(String addition) {
        if(addnum<=3) {
            this.additons[this.addnum] = addition;
            this.addnum = this.addnum + 1;
        }
    }

    public void ShowOrder(){
        System.out.println("Burger name: "+ this.name);
        System.out.println("Base price: "+this.price + "$");
        System.out.println("ingredients: ");
        System.out.println("- bread roll: " +this.breadroll);
        System.out.println("- meat: " +this.meat);
        for(int i =0 ; i < this.addnum ; i++ ) {
            System.out.println("- add " + (i+1)+ ": " + this.additons[i] + "  +" + this.addprice + "$");
        }
        System.out.println("--------------");
        System.out.println("Total price: " + (this.price + this.addnum * this.addprice) + "$\n\n");

    }

}
