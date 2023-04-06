package exercises.class2;
public class MyClass {
    public static void main (String[] args){
        MyClass myFirstClass = new MyClass();
        myFirstClass.myFirstMethod();

    }

    private String myFirstClassVariable = "This is a string variable";
    public MyClass(){

    }
    public void myFirstMethod(){
        System.out.println("Hello World!");
    }
}
