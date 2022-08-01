package exercises.chap4.School;

public class Student {
    public static void main(String[] args) {

        Student myself = new Student("Denys", 1, 1, 4.0);

      //  String myGradeLevel = myself.getGradeLevel(50);
       // System.out.println(myGradeLevel);
       // myself.addGrade(3,3.0);
        //System.out.println(myself.toString());
        //Teacher theTeacher = new Teacher();
        //Student twin = new Student("Viridiana", 1, 1, 4.0);
        //System.out.println(myself.equals(twin));
    Course myFirstCourse = new Course("My First Course", 2);
    Course mySecondCourse = new Course("My Second Course", 4);
System.out.println(myFirstCourse.equals(mySecondCourse));
        System.out.println(myFirstCourse.toString());

    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        double qualityScore = grade * courseCredits;
        double totalQuality =  this.gpa * this.numberOfCredits;
        totalQuality += qualityScore;
        this.numberOfCredits = courseCredits;
        this.gpa = totalQuality/this.numberOfCredits;

    }

    public String getGradeLevel(int credits) {
        if (credits <= 29) {
            return "Freshman";
        } else if (credits <= 59) {
            return "Sophomore";
        } else if (credits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Student) == false){
            return false;
        }
        Student myStudentObj = (Student) obj;
        if(myStudentObj.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }

    /* getters and setters omitted */
        //Setters
        public void setName(String name){
            this.name = name;
        }

        private void setStudentId ( int studentId){
            this.studentId = studentId;
        }
        public void setNumberOfCredits ( int numberOfCredits){
            this.numberOfCredits = numberOfCredits;
        }
        public void setGpa (Double gpa){
            this.gpa = gpa;
        }
        //Getters
        public String getName () {
            return name;
        }
        public double getGpa () {
            return gpa;
        }
        public int getStudentId () {
            return studentId;
        }
        public int getNumberOfCredits () {
            return numberOfCredits;
        }
    }

