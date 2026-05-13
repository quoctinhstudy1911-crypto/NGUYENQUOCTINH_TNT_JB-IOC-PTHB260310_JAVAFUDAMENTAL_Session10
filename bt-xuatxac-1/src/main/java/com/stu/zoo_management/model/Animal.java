package com.stu.zoo_management.model;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void showInfo()
    {
        System.out.println("Name: "+ name + " and age: "+ age);
    }
    public void makeSound()
    {
        System.out.println( name +" says");
    }
    public void eat()
    {
        System.out.println(name + "is eating");
    }
    public void eat(String food)
    {
        System.out.println(name + "is eating "+ food);
    }
}
