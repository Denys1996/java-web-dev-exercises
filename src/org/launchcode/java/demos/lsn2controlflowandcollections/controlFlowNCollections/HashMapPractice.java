package org.launchcode.java.demos.lsn2controlflowandcollections.controlFlowNCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> bananaCat = new HashMap<>();
        bananaCat.put("Name", "Banana Cat");
        bananaCat.put("Age", "Ageless");
        bananaCat.put("Occupation", "Being really cool");
        bananaCat.put("Favorite Food", "Stinky Tofu");

        HashMap<String, String> appleDog = new HashMap<>();
        appleDog.put("Name", "Apple Dog");
        appleDog.put("Age", "420 days, 69 hours");
        appleDog.put("Occupation", "Being really LAME");
        appleDog.put("Favorite Food", "Gerard's sense of humor");

        HashMap<String, String> gerald = new HashMap<>();
        gerald.put("Name", "Gerard Darris");
        gerald.put("Age", "31");
        gerald.put("Occupation", "Lead Instructor");
        gerald.put("Favorite Food", "The tears of LC101 students trying to undertand HashMaps");

        ArrayList<HashMap<String, String>> bucket = new ArrayList<>();
        bucket.add(bananaCat);
        bucket.add(appleDog);
        bucket.add(gerald);

        for(HashMap<String, String> item : bucket) {
            for(Map.Entry<String, String> person : item.entrySet()) {
                System.out.println(String.format("%s: %s", person.getKey(), person.getValue()));
            }
        }
    }

}
