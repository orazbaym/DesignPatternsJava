package com.company;

public class Tiger extends Organism{

    public Tiger(SurvivalBehavior survivalBehavior) {
        super(new meatBehavior());
    }

    @Override
    void display() {
        System.out.println("I am tiger");
    }
}
