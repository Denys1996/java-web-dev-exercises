package exercises;

import java.util.Scanner;

public class NumericTypes {

    public static void main(String[] args) {
        NumericTypes areaOfRectangle = new NumericTypes();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of the Rectangle: ");
        Double myRectLength = scanner.nextDouble();
        System.out.println("Width of the Rectangle: ");
        Double myRectWidth = scanner.nextDouble();

        //Area = width * length
        Double area = myRectLength * myRectWidth;
        System.out.println("The Are of the Rectangle is: " + area.toString());
        }
    }
