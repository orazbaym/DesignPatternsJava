package com.company;

public class Main {

    public static void main(String[] args) {

        Organism organism = new Person();

        organism.display();
        organism.performEat();

        organism.setSurvivalBehavior(new greensBehavior());

        organism.performEat();


    }
}