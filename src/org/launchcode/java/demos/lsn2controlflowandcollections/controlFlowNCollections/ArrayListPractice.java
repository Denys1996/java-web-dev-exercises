package org.launchcode.java.demos.lsn2controlflowandcollections.controlFlowNCollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> assignment = new ArrayList<>();
        assignment.add("Mars Rover (yuck)");
        assignment.add("Launch Checklist Form");
        assignment.add("Techjobs Console");

        ArrayList<String> names = new ArrayList<>() {
            {
                add("Gerard");
                add("Banana Cat");
                add("Gritty");
            }
        };

        ArrayList<ArrayList<String>> things = new ArrayList<>();
        things.add(assignment);
        things.add(names);

        //System.out.println(assignment);
        //System.out.println(names);
        //System.out.println(things);

        // interaction ArraList

//        for (int i=0; i <assignment.size(); i++) {
//            System.out.println(assignment.get(i));
//        }

//        for (String name : names) {
//            System.out.println(name);
//        }

        for(int i=0; i < things.size(); i++) {
            for (String item : things.get(i)) {
                System.out.println(item);
            }
        }
    }
}
