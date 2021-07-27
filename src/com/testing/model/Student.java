package com.testing.model;

public class Student<name> {
    private String name;
    private int age;
    private char gender;
    private int studNum;

    //constructor method
    public Student(String name, int age, char gender, int studNum)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this. studNum = studNum;
    }

    //member method
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getStudNum()
    {
        return studNum;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }
}
