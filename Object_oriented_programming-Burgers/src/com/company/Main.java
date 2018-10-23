package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Burger burger = new Burger();
        HealthyBurger Hburger = new HealthyBurger();
        DeluxBurger Dburger = new DeluxBurger();

        burger.AddAdditon("cheese");
        burger.AddAdditon("bacon");
        burger.AddAdditon("onion");
        burger.AddAdditon("ketchup");
        burger.AddAdditon("tomato");
        burger.AddAdditon("lettuce");


        Hburger.AddAdditon("cheese");
        Hburger.AddAdditon("bacon");
        Hburger.AddAdditon("onion");
        Hburger.AddAdditon("ketchup");
        Hburger.AddAdditon("tomato");
        Hburger.AddAdditon("lettuce");

        Dburger.AddAdditon("cheese");
        Dburger.AddAdditon("bacon");
        Dburger.AddAdditon("onion");
        Dburger.AddAdditon("ketchup");
        Dburger.AddAdditon("tomato");
        Dburger.AddAdditon("lettuce");


        burger.ShowOrder();
        Hburger.ShowOrder();
        Dburger.ShowOrder();


    }
}
