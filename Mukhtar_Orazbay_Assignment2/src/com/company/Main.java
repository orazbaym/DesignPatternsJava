 package com.company;

public class Main {

    public static void main(String[] args) {
        Moodle moodleAitu = new Moodle();
        moodleAitu.addSubjects("Advanced Java");
        moodleAitu.addSubjects("Python");

        Student someUser = new Student("Nur");
        Student someUser2 = new Student("Artem");

        moodleAitu.registerStudent(someUser);
        moodleAitu.registerStudent(someUser2);

        moodleAitu.addSubjects("Advanced C#");
        moodleAitu.removeSubjects("Python");
    }
}
