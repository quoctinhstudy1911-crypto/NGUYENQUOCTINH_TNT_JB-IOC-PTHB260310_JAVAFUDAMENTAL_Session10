package com.stu.zoo_management.model;

public class Cat extends Mammal {

    public Cat() {
    }

    public Cat(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }
    @Override
    public void makeSound()
    {
        System.out.println(super.getName() + " says: meow meow");
    }
    public void climbTree()
    {
        System.out.println(super.getName() +" is climbing a tree");
    }
}
