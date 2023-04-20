package org.launchcode.java.demos.lsn4classes2;

import org.launchcode.java.demos.lsn3classes1.School.Student;

import java.util.ArrayList;

public class Course {
    private String name;
    private  int worthNumberOfCredits;
    private ArrayList<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
    }

// TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits. ";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course == false) {
            return false;
        }
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }

//    public static void main(String[] args) {
//        Course math = new Course("Math");
//
//        Course science = new Course("Science");
//        System.out.println(science.equals(math));
//    }
}
