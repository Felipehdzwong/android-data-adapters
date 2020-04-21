package com.example.dataadapter.model;

import java.util.ArrayList;

public class Student {
    private int picture;
    private String name;
    private String country;

    public Student(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Student(String name){
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static ArrayList<Student> getUsers() {
        ArrayList<Student> users = new ArrayList<Student>();
        users.add(new Student("Nadine", "Trinidad and Tobago"));
        users.add(new Student("Kanya", "United States"));
        users.add(new Student("Danilo", "Brazil"));
        users.add(new Student("Peter", "South Korea"));
        users.add(new Student("Felipe", "Mexico"));
        users.add(new Student("Lourenco", "Brazil"));
        users.add(new Student("Paul", "Ireland"));
        users.add(new Student("Rodrigo", "Brazil"));
        users.add(new Student("Emiliano", "United States"));
        users.add(new Student("Rainer", "Estonia"));
        return users;
    }
}