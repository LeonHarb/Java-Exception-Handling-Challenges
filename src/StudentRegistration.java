// Assignment #10: Exception Challenges
// Challenge #4 by Leon Harb

import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Type 'exit' to stop course registration.");

        while (true) {
            System.out.print("Enter course code to register: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Registration ended.");
                break;
            }

            try {
                student.registerCourse(input);
            } catch (CourseNotFoundException e) {
                System.out.println("CourseNotFoundException: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
