package org.launchcode.java.studios.areaofacircle;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while (keepOnLooping) {
                System.out.println("Enter a radius: ");
                Double radius = scanner.nextDouble();
                // Checks if the input is a negative number
                if (radius < 0) {
                    //print an error to the user
                    System.out.println("You can not enter a negative number");
                } else {
                    //continue as normal
                    double areaCircle = Circle.getArea(radius);

                    System.out.println("The are of a circle of radius " + radius + " is " + areaCircle);
                }
            }

        } catch (Exception error) {
            System.out.println("You must provide a numeric input");
        }
    }
    }
