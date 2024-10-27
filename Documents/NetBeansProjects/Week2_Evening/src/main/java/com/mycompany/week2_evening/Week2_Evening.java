/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.week2_evening;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Week2_Evening {

    double radius, area, perimeter, height, width;
    String color;
    boolean isFilled;

    public static void main(String[] args) {

        Week2_Evening evening = new Week2_Evening();
        evening.createCircle();
        evening.createRectangle();

    }

    private void createCircle() {

        radius = 20;
        area = 50.5;
        perimeter = 30;
        color = "red";
        isFilled = true;

        Circle my_circle = new Circle(radius, area, perimeter, color, isFilled);
        System.out.println("The radius of the circle: " + my_circle.getRadius());

        radius = - 30;

        my_circle.setRadius(radius);
        System.out.println("The new radius of the circle: " + my_circle.getRadius());

        System.out.println(my_circle.toString());

    }

    private void createRectangle() {

        area = 50.5;
        perimeter = 30;
        color = "red";
        isFilled = true;
        width = 45;
        height = 55;
        
        Rectangle rectangle = new Rectangle(height, width, area, perimeter, color, isFilled);
        
        // to be continued
        
        

    }

}
