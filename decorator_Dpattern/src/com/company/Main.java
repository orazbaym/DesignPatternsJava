package com.company;

public class Main {
    public static void main(String[] args){
        EnglishGK englishGK = new EnglishGK();
        jumpingDecorator englishGKWithJumping = new jumpingDecorator(englishGK);
        kickingDecorator englishGKWithKicking = new kickingDecorator(englishGKWithJumping);
        System.out.println(englishGKWithJumping.getCost());
        System.out.println(englishGKWithKicking.getCost());

    }
}

