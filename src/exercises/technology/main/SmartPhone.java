package exercises.technology.main;

public class SmartPhone extends Computer{
    //Class Variable (properties)
    private boolean isConnectedTo5G;
    //Constructors

    public SmartPhone(int screenHeight, int screenWidth, String manufactureYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //Methods


    public boolean getIsConnectedTo5G() {
        return isConnectedTo5G;
    }

    public void makePhoneCalls(String number) {
        System.out.println("Calling: " + number);
    }
}
