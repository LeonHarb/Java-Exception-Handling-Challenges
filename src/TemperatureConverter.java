// Assignment #10: Exception Challenges
// Challenge #4 by Leon Harb

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double ABSOLUTE_ZERO_CELSIUS = -273.15;

        System.out.print("Enter Celsius temperature: ");
        String input = scanner.nextLine();

        try {
            double celsius = Double.parseDouble(input);

            if (celsius < ABSOLUTE_ZERO_CELSIUS) {
                throw new InvalidTemperatureException("Temperature cannot be below absolute zero.");
            }

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Fahrenheit: %.1f°F\n", fahrenheit);

        } catch (InvalidTemperatureException e) {
            System.out.println("InvalidTemperatureException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close();
    }
}

