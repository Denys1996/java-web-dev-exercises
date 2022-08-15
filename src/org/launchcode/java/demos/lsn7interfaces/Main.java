package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        System.out.println("\nBefore Sort: ");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
       // flavors.sort(new FlavorComparator());


        System.out.println("\nAfter Sort: ");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
        }

        System.out.println("\nBefore Sort: ");
        for(Cone cone :  cones) {
            System.out.println("$" + cone.getCost());
        }
        cones.sort((new ConeComparator()));


        System.out.println("\nAfter Sort: ");
        for(Cone cone :  cones) {
            System.out.println("$" + cone.getCost());
        }

        System.out.println("\nBefore Sort: ");
        for(Topping topping :  toppings) {
            System.out.println(topping.getName() + " Tastiness: " + topping.getTastiness());
        }
        toppings.sort((new ToppingComparator()));


        System.out.println("\nAfter Sort: ");
        for(Topping topping :  toppings) {
            System.out.println(topping.getName() + " Tastiness: " + topping.getTastiness());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
