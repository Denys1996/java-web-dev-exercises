package exercises.chap4.School;

import java.util.ArrayList;

public class Course {
    //at least 3 fields
            //name
    String name;
            //list of student
    ArrayList<Student> students;
            //worth number of credits
    int worthNumberOfCredits;

    //Constructors
    public Course(String name, int worthNumberOfCredits) {
        this.name = name;
        this.worthNumberOfCredits =worthNumberOfCredits;
    }

    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Course) == false){
            return false;
        }
        Course myCourseObj = (Course) obj;
        if(myCourseObj.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }
}

