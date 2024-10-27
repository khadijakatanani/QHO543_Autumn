/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_evening;

/**
 *
 * @author Admin
 */
public class Shape {
    
    // fields must be private
    
    private double area;
    private double perimeter;
    private String color;
    private boolean isFilled;

    public Shape(double area, double perimeter, String color, boolean isFilled) {
        this.area = area;
        this.perimeter = perimeter;
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", perimeter=" + perimeter + ", color=" + color + ", isFilled=" + isFilled + '}';
    }
}
