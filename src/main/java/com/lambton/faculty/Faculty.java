package com.lambton.faculty;

import com.lambton.person.Person;

public class Faculty extends Person {
    String designation;
    int totalSalary;

    public Faculty(int id, String name, String gender) {
        super(id, "komal", "female", name, gender, 450, 4);
    }


    public String getDesignation() {
        return designation;
    }





    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

}
