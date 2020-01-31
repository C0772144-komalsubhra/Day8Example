package com.lambton;

import com.lambton.students.Student;

public final class PartTimeStudent extends Student {
    int numberOfDays;

    public PartTimeStudent(int id, String name, String gender, String courseName, String collegeName, int totalMarks, int numberOfDays) {
        super(id, name, gender, courseName, collegeName, totalMarks, 4);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public void display() {
        System.out.println("i am from parttime");
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    public void test(){

    }
}
