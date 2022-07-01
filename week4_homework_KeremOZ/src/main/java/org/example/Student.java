package org.example;

public class Student{

    Long id;
    String name;
    String surName;
    Long age;

    public Student(Long id, String name, String surName, Long age) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}

