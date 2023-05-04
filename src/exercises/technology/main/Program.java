package exercises.technology.main;

public class Program {
    public static void main (String[] args){
        Smartphone smartphone1 = new Smartphone("2023", 256, 11, true);
            smartphone1.connectedToWifi();
            int answer = smartphone1.addNumbers();
        System.out.println("The answer is: " + answer);

        Laptop laptop1 = new Laptop("2013", 256, 20, false);
        laptop1.wirelessMouse();
        int result = laptop1.addNumbers();
        System.out.println("The answer is: " + result);

        Computer computer1 = new Computer("2021", 256, 25);
        int results = computer1.addNumbers();
        System.out.println("The answer is: " + result);
    }
}
