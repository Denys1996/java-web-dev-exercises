package org.launchcode.java.demos.lsn7interfaces;
import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor>{

    @Override
    public int compare(Flavor o1, Flavor o2) {
        //return o1.getName().compareTo(o2.getName());

        //Sort allergens from high to low
        //Negative integer if o1 is greater than o2
        //Positive integer if o1 is less than o2
        //zero if o1 and o2 are equal
        if(o1.getAllergens().size() > o2.getAllergens().size()) {
           return -1;
        } else if (o1.getAllergens().size() < o2.getAllergens().size()) {
            return 1;
        } else {
            return 0;
        }
    }

}
