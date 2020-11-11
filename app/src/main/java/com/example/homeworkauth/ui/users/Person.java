package com.example.homeworkauth.ui.users;

import java.util.ArrayList;
import java.util.List;

public class Person {
   public String name;
   public String age;

    public Person() { }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public List initializeData() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old"));
        persons.add(new Person("Lavery Maiss", "25 years old"));
        persons.add(new Person("Lillie Watts", "35 years old"));
        return persons;
    }

}
