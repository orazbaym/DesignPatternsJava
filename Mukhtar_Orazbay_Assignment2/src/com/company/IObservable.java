package com.company;

public interface IObservable {
    void registerStudent(IObserver student);
    void unregisterStudent(IObserver student);
    void notifyAllStudents();
}
