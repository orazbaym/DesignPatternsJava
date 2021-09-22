package com.company;

public class Main {

    public static void main(String[] args) {

        Character character = new Troll();

        character.display();
        character.performHit();

        character.setWeaponBehavior(new SwordBehavior());

        character.performHit();


    }
}
