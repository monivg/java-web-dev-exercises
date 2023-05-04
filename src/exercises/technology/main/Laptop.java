package exercises.technology.main;

import exercises.technology.main.Computer;

public class Laptop extends Computer {

    private boolean usingBuiltInMouse;

    public Laptop(String year, int storage, int screenSize) {
        super(year, storage, screenSize);
        this.usingBuiltInMouse = true;
    }
    public Laptop(String year, int storage, int screenSize, boolean usingBuiltInMouse) {
        super(year, storage, screenSize);
        this.usingBuiltInMouse = usingBuiltInMouse;
    }

    public boolean getUsingBuiltInMouse() {
        return this.usingBuiltInMouse;
    }

    public void setUsingBuiltInMouse(boolean usingBuiltInMouse) {
        this.usingBuiltInMouse = usingBuiltInMouse;
    }

    public void wirelessMouse(){
        this.usingBuiltInMouse = false;
        System.out.println("Wireless Mouse is connected.");
    }



}
