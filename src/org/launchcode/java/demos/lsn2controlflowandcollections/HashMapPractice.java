package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudent = input.nextInt();
            // Read in the newline before looping back
            input.nextLine();

            if (!newStudent.equals(-1)) {
                System.out.print("Student Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudent, newStudentName);

            }

        } while(!newStudent.equals(-1));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());

        }
    }
}