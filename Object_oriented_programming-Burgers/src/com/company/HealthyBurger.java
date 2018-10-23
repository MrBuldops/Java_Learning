package com.company;

public class HealthyBurger extends  Burger {

    public HealthyBurger() {
        super.setName("Healthy Burger");
        super.setPrice(5);
        super.setBreadroll("brown rye");
        super.setMeat("chicken");
    }

    public void AddAdditon(String addition) {
        if(super.getAddnum()<=5) {
            super.getAdditons()[super.getAddnum()] = addition;
            super.setAddnum(super.getAddnum() + 1);
        }
    }


}

