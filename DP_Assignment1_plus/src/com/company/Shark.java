package com.company;

public class Shark extends Organism{

    public Shark(SurvivalBehavior survivalBehavior) {
        super(new seafoodBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Shark");
    }
}
