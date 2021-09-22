package com.company;

public class Person extends Organism {

    public Person() {
        super(new AppleBehavior());
    }

    @Override
    void display() {
        System.out.println("I am vegetarian person");
    }
}