package exercises.technology.main;

public class Computer extends AbstractEntity{
    //Class Variables (properties)
    private int screenWidth;
    private int screenHeight;
    private String manufatureYear;

    //Constructor
    public Computer(int screenWidth, int screenHeight, String manufatureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufatureYear = manufatureYear;
    }

    //Methods
            //getters & setters

    public int getScreenHeight() {
        return screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public String getManufatureYear() {
        return manufatureYear;
    }

    public int processTwoPlusTwo() {
        return 2 + 2;
    }

    public void tellMeAJoke() {
        System.out.println("Why did the computer show up at work late? It had a hard drive!");
    }
}
