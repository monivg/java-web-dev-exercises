package exercises.technology.main;

public class Smartphone extends Computer {

    private boolean isConnectedToWifi;
    public Smartphone(String year, int storage, int screenSize, boolean isConnectedToWifi) {
        super(year, storage, screenSize);
        this.isConnectedToWifi = isConnectedToWifi;
    }

    public boolean getConnectedToWifi() {
        return this.isConnectedToWifi;
    }

    public void connectedToWifi(){
        this.isConnectedToWifi = true;
        System.out.println("Phone is now connected to wifi.");
    }

}
