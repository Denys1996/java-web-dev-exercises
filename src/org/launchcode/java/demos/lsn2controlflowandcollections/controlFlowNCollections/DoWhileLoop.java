package org.launchcode.java.demos.lsn2controlflowandcollections.controlFlowNCollections;
import java.util.Scanner;
public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        do{
            System.out.println("Hello, " + name + "!");
            System.out.println("Enter your name:");
            name = input.nextLine();
        } while(!name.equals(""));

        input.close();
        System.out.println("Shutting down...");
    }
}
