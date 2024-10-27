/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_evening;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {

    private double radius; // 20

    public Circle(double radius, double area, double perimeter, String color, boolean isFilled) {
        super(area, perimeter, color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius <= 0) {
            System.out.println("The value of the radius must be greater than 0");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

}
