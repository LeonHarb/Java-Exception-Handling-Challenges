// Assignment #10: Exception Challenges
// Challenge #1 by Leon Harb

import java.io.*;
import java.util.Scanner;

public class FileProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();

        try {
            File file = new File(filename);

            if (!file.exists()) {
                throw new FileNotFoundException("The file " + filename + " does not exist.");
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int lineCount = 0;
            int wordCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    lineCount++;
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            reader.close();

            if (lineCount == 0 && wordCount == 0) {
                throw new EmptyFileException("The file is empty.");
            }

            System.out.println("Total lines: " + lineCount);
            System.out.println("Total words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }

        scanner.close();
    }
}
