package exercises.technology.main;

public class Computer extends AbstractEntity{
    //3 properties, 2 methods, constructor
    private String year;
    private int storage;
    private int screenSize;

    public Computer (String year, int storage, int screenSize){
        this.year = year;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public String getYear() {
        return year;
    }

    public int getStorage() {
        return storage;
    }


    public int getScreenSize() {
        return screenSize;
    }


    public void printRandomMessage(){
        System.out.println("Technology is changing the world!");
    }

    public int addNumbers(){
        return 1+1;
    }

}
