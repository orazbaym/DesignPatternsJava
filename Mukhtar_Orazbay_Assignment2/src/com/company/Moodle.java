package com.company;

import java.util.ArrayList;
import java.util.List;

public class Moodle implements IObservable{
    private List<String> subjects = new ArrayList<>();
    private List<IObserver> students = new ArrayList<>();

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }

    public List<IObserver> getStudents() { return students; }
    public void setStudents(List<IObserver> students) { this.students = students; }

    public void addSubjects(String subject){
        this.subjects.add(subject);
        notifyAllStudents();
    }

    public void removeSubjects(String subject){
        this.subjects.remove(subject);
        notifyAllStudents();
    }

    @Override
    public void registerStudent(IObserver student) {
        this.students.add(student);
    }

    @Override
    public void unregisterStudent(IObserver student) {
        this.students.remove(student);
    }

    @Override
    public void notifyAllStudents() {
        for (IObserver observer : this.students){
            observer.update(this.subjects);
        }
    }
}
