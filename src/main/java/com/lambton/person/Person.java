package com.lambton.person;

import com.lambton.IDisplay;

public abstract class Person implements IDisplay {
    public int id;
    public String name;
    public String gender;

    public Person(int id, String komal, String female, String name, String gender, int i1, int i) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void display() {
        System.out.println("i am from person");
    }
  @Override
  public void print(){
        System.out.println("Person print");
  }
}
