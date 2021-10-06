package com.company;

public class SkillsDecorator implements goalkeeper {
    goalkeeper goalkeeper;

    public SkillsDecorator(goalkeeper goalkeeper){
        this.goalkeeper = goalkeeper;
    }
    @Override
    public Integer getCost() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
