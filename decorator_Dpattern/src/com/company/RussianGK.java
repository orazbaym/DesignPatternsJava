package com.company;

public class RussianGK implements goalkeeper {

    @Override
    public Integer getCost() {
        return 10000;
    }

    @Override
    public String getDescription() {
        return "RussianGK" ;
    }
}