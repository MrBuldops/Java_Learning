package com.company;

public class DeluxBurger extends Burger {

    private double drinkprice = 1;
    private double chipsprice = 2;

    public DeluxBurger() {
        super()
        super.setName("Delux");
        super.AddAdditon("chips");
        super.AddAdditon("drink: Coca-cola");
    }

    public void ShowOrder(){
        System.out.println("Burger name: "+ this.getName());
        System.out.println("Base price: "+this.getPrice() + "$");
        System.out.println("ingredients: ");
        System.out.println("- bread roll: " +this.getBreadroll());
        System.out.println("- meat: " +this.getMeat());
        double total = this.getPrice();
        for(int i =0 ; i < this.getAddnum() ; i++ ) {
            if(this.getAdditons()[i] == "chips") {
                System.out.println("- add " + (i + 1) + ": " + this.getAdditons()[i] + "  +" + this.chipsprice + "$");
                 total = total + this.chipsprice;
            }
                else if (this.getAdditons()[i] == "drink: Coca-cola") {
                    System.out.println("- add " + (i + 1) + ": " + this.getAdditons()[i] + "  +" + this.drinkprice + "$");
                     total = total + this.drinkprice;
                }

                else {
                System.out.println("- add " + (i + 1) + ": " + this.getAdditons()[i] + "  +" + this.getAddprice() + "$");
                 total = total + this.getAddprice();
            }
        }


        System.out.println("--------------");
        System.out.println("Total price: " + total + "$\n\n");

    }


}

