package com.company;

import java.util.List;

public class Student implements IObserver{
    private String name;

    public Student(String name){ this.name = name; }

    @Override
    public void update(List<String> subjects) {
        System.out.println("Dear " + this.name + "\nWe have some changes in schedule:\n" + subjects + "\n");
    }
}
