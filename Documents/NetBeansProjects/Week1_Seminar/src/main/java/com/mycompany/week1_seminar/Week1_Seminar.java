/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1_seminar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Week1_Seminar {

    public static void main(String[] args) {        
        Week1_Seminar seminar1 = new Week1_Seminar();
        seminar1.areaCircle();
        seminar1.factorialCalculator();
    }
    private void areaCircle() {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        double area = Math.PI*Math.pow(radius, 2); // radius*radius        
        System.out.printf("The area of the circle with "
                + "radius %.3f is %.2f%n", radius, area);
        
    }

    private void factorialCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        
        int number = input.nextInt();
        int result = 1;

        for (int i = 2; i <= number; i++){            
            result *= i; // the same: result = result * i;
        }
        
        System.out.println("The factorial for the "
                + "number " + number + " is " + result);
    
    
    }
}
