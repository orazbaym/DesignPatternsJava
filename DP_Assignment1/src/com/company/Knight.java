package com.company;

public class Knight extends Character{

    public Knight(WeaponBehavior weaponBehavior) {
        super(new BowAndArrowWeaponBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Knight!");
    }
}
