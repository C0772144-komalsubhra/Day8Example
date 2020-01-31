package com.lambton;

import com.lambton.person.Person;
import com.lambton.students.Student;

public class MainClass {
    public static void main(String[] args) {
       Person p1;//=new Person(1,"komal","female");
        Student s1=new Student(1,"komal","female","student","lambton",450, 4);
        PartTimeStudent p2= new PartTimeStudent(2,"geet","female","student","lambton",560,4);



       IDisplay iDisplay;
       iDisplay=s1;
       iDisplay.display();
       iDisplay=p2;
       iDisplay.display();




    }
}
