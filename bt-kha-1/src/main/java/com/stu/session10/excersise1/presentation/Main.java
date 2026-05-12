package com.stu.session10.excersise1.presentation;

import com.stu.session10.excersise1.model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Tên của con chó là: "+dog.getName());
        dog.makeSound();
    }
    // Ở bài này thì ta sẽ thấy 1 số vấn đề quan trọng như là:
    // Khi khai báo name ở animal là protected thì lớp con có khả năng gọi this.name
    // Khi mà ta không viết hàm overriding thì lớp con sẽ thực hiện phương thức makeSound của lớp cha
}
