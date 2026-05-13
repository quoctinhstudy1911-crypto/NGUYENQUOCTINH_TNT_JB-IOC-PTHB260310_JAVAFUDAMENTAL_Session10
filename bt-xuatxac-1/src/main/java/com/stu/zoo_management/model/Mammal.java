package com.stu.zoo_management.model;

public class Mammal extends Animal {
    private boolean hasFur;

    public Mammal() {
    }

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
    @Override
    public void showInfo()
    {
        System.out.println("Name: "+ super.getName() + " and age: "+ super.getAge() + "\n"+ "Has fur: "+ hasFur);
    }
}
