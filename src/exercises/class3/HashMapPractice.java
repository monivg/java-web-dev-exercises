package exercises.class3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        do {
            System.out.print("Student ID: ");
            newStudentId = input.nextInt();

            input.nextLine();

            if (!newStudentId.equals(-1)) {
                System.out.print("Student Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);

                input.nextLine();
            }
        } while (!newStudentId.equals(-1));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey()  + " " + student.getValue());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
