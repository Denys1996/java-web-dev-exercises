package exercises;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class MilesPerGallon {

    public static void main(String[] args) {
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How much gas did you use? In gallons: ");
        Double numGallons = scanner.nextDouble();

        // Miles per gallon = miles / gallons
        Double mpg = milesDriven / numGallons;
        System.out.println("You are running on " + mpg + "mpg.");

    }

}
