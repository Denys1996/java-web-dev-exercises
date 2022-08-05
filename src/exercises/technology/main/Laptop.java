package exercises.technology.main;

public class Laptop extends Computer{
    //Class Variable (properties)
    private boolean isIntelliJOpened;

    //Constructor
    public Laptop(int screenHeight, int screenWidth, String manufactureYear) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpened = false;
    }

    public Laptop(int screenHeight, int screenWidth, String manufactureYear, boolean isIntelliJOpened) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpened = isIntelliJOpened;
    }

    //Methods


    public boolean getIsIntelliJOpened() {
        return isIntelliJOpened;
    }

    public void setIsIntelliJOpened() {
        isIntelliJOpened = false;
    }


    public void openIntelliJ() {
        this.isIntelliJOpened = true;
        System.out.println("IntelliJ is now opened");
    }
}

