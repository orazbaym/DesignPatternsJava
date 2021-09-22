package com.company;

public class King extends Character {

    public King(WeaponBehavior weaponBehavior) {
        super(new SwordBehavior());
    }

    @Override
    void display() {
        System.out.println("I am King");
    }
}
