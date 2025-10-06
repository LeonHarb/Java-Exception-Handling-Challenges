// Assignment #10: Exception Challenges
// Challenge #2 by Leon Harb

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
                System.out.println("Password accepted.");
                break;
            } catch (InvalidPasswordException e) {
                System.out.println("InvalidPasswordException: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8 || !password.matches(".*\\d.*") || !password.matches(".*[A-Z].*")) //This can also be done using a loop and the Character.isDigit method from the character class.
        {
                throw new InvalidPasswordException("Password must be at least 8 characters, contain one digit and one uppercase letter.");
        }
             
    }
}
