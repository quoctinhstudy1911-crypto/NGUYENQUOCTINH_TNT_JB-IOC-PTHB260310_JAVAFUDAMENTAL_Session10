package com.stu.excersice2.presentacion;

import com.stu.excersice2.model.Circle;
import com.stu.excersice2.model.Rectangle;
import com.stu.excersice2.model.Shape;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2,3);
        System.out.println("Diện tích của hình chữ nhật là: "+s1.area());
        Shape s2 = new Circle(1);
        System.out.println("Diện tích của hình tròn là: "+s2.area());
    }
    // Bài tập tập này chủ yếu tập trung vào tính overriding của kế thừa, mỗi phương thức area thì sẽ có thể là của shape, rectangle hay là của circle
}
