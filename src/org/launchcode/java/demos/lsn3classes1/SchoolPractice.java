package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.Student;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student grades = new Student();
        grades.setGpa(4.0);
        grades.setNumberOfCredits(1);
        System.out.println(grades.getGpa());
        System.out.println(grades.getNumberOfCredits());
    }
}
