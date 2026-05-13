package com.stu.zoo_management.model;

public class Dog extends Mammal {
    public Dog() {
    }

    public Dog(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }
    @Override
    public void makeSound()
    {
        System.out.println(super.getName() + " says: woof woof");
    }
    public void fetchBall()
    {
        System.out.println(super.getName() +" is fetching the ball");
    }

}
