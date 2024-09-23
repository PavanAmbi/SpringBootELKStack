package com.practice.springbootelasticlogstashkibana.model;


public class User {
    String name;
    int age;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
