package com.company;

public class jumpingDecorator extends SkillsDecorator {

    public jumpingDecorator(goalkeeper goalkeeper) {
        super(goalkeeper);
    }
    @Override
    public Integer getCost(){
        return goalkeeper.getCost() + 1000;
    }
}