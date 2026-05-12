package com.stu.excersice2.model;

public class Rectangle extends Shape {
    private double Height;
    private double Width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        Height = height;
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public double area()
    {
        return Height*Width;
    }
}
