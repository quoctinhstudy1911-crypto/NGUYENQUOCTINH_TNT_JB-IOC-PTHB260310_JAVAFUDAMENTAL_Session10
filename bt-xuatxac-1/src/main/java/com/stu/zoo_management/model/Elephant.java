package com.stu.zoo_management.model;

public class Elephant extends Mammal {
    public Elephant() {
    }

    public Elephant(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }
    @Override
    public void makeSound()
    {
        System.out.println(super.getName() + " says: Pawoooooooooooo");
    }
    public void sprayWater()
    {
        System.out.println(super.getName() +" is spraying a water");
    }
}
