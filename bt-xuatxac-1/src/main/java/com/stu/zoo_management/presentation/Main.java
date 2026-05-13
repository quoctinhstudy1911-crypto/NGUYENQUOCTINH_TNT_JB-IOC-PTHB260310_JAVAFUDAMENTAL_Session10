package com.stu.zoo_management.presentation;

import com.stu.zoo_management.model.Animal;
import com.stu.zoo_management.model.Cat;
import com.stu.zoo_management.model.Dog;
import com.stu.zoo_management.model.Elephant;

import javax.swing.plaf.ViewportUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> listAni = new ArrayList<>();
        boolean running = true;
        while (running)
        {
            int choose;
            infomationMenu();
            System.out.println("Chọn chức năng: ");
            choose = scanner.nextInt();
            switch (choose)
            {
                case 1:
                {
                    Animal ani1 = new Dog("Buddy",3,true);
                    listAni.add(ani1);
                    Animal ani2 = new Cat("Mimi",2, true);
                    listAni.add(ani2);
                    Animal ani3 = new Elephant("Dumbo",10,false);
                    listAni.add(ani3);
                    System.out.println("--- Thông tin các loài động vật ---");
                    for (Animal animal : listAni)
                    {
                        animal.showInfo();
                    }
                    break;
                }

                case 2:
                {
                    System.out.println("--- OVERRIDING: makeSound() ---");
                    for (Animal animal : listAni)
                    {
                        animal.makeSound();
                    }
                    break;
                }

                case 3:
                {
                    System.out.println("--- OVERLOADING: eat() ---");
                    for (Animal animal : listAni)
                    {
                        animal.eat();
                        if(animal instanceof Cat)
                        {
                            animal.eat("fish");
                        }
                    }

                    break;
                }

                case 4:
                {
                    System.out.println("--- POLYMORPHISM RUNNING ---");
                    for (Animal animal : listAni)
                    {
                        animal.makeSound();
                    }

                    break;
                }

                case 5:
                {
                    System.out.println("--- PHƯƠNG THỨC RIÊNG CỦA TỪNG LOÀI ---");
                    for (Animal animal : listAni)
                    {
                        if(animal instanceof Cat)
                        {
                            ((Cat)animal).climbTree();
                        }
                        else if (animal instanceof Dog)
                        {
                            ((Dog)animal).fetchBall();
                        }
                        else ((Elephant) animal).sprayWater();
                    }
                    break;
                }
                case 0:
                {
                    System.out.println("Thoát chương trình...");
                    running = false;
                    break;
                }
                default:
                {
                    System.out.println("Vui lòng chọn đúng thông tin của chương trình ");
                }

            }
        }

    }

    public static void infomationMenu()
    {
        System.out.println("""
                ================ ZOO MANAGEMENT MENU =================
                
                1. Tạo đối tượng và hiển thị thông tin (Kế thừa + super)
                2. Kiểm tra Overriding: gọi makeSound() của từng con vật
                3. Kiểm tra Overloading: gọi eat() và eat(String)
                4. Kiểm tra đa hình runtime (Animal array)
                5. Gọi phương thức đặc trưng của từng loài
                0. Thoát chương trình
                
                ======================================================
                """);
    }

}
