package exercises.class3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {

    public static void main (String[] args){
//        ArrayList<Integer> tenIntegers = new ArrayList<>(Arrays.asList(70,76,74,90,95,97,99,67,65,94));
////        tenIntegers.add(70);
////        tenIntegers.add(76);
//        tenIntegers.add(74);
//        tenIntegers.add(90);
//        tenIntegers.add(95);
//        tenIntegers.add(97);
//        tenIntegers.add(99);
//        tenIntegers.add(67);
//        tenIntegers.add(65);
//        tenIntegers.add(94);
//
//        System.out.println(tenIntegers);
//        System.out.println(sumEven(tenIntegers));

        ArrayList<String> words = new ArrayList<String>(Arrays.asList("codes","launch", "class"));
        System.out.println("Enter the word length: ");
        Integer searchLength = ArrayListPractice.getUserInput();
        ArrayListPractice.printWordWithFiveLetters(words, searchLength);
    }

    public static Integer sumEven(ArrayList<Integer> sumValue) {
        int total = 0;
        for (int integer : sumValue) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void  printWordWithFiveLetters (ArrayList<String> words, Integer searchLength){
        for (int i =0 ; i < words.size(); i++){
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }

    public static Integer getUserInput (){
        Scanner scanner = new Scanner(System.in);
        Integer  input = scanner.nextInt();
        scanner.close();
        return input;
    }
}
