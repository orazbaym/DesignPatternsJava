package com.company;

public class Queen extends Character {

    public Queen(WeaponBehavior weaponBehavior) {
         super(new KnifeWeaponBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Queen!");
    }
}
