package com.company;

public class kickingDecorator extends SkillsDecorator {

    public kickingDecorator(goalkeeper goalkeeper) {
        super(goalkeeper);
    }

    @Override
    public Integer getCost(){
        return goalkeeper.getCost() + 2000;
    }
}
