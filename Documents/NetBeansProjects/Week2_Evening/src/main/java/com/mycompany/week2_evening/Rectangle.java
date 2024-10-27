/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_evening;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{

    private double height;
    private double width;

    // through the constructor method, we create objects

    public Rectangle(double height, double width, double area, double perimeter, String color, boolean isFilled) {
        super(area, perimeter, color, isFilled);
        this.height = height;
        this.width = width;
    }
    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }

    

}
