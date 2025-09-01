package homework12;

import homework12.exception.NewException1;
import homework12.exception.NewException2;
import homework12.exception.NewException3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionsUtil {
    //task 1
    //Write a program that reads an integer from the user and prints its reciprocal.
    // If the user enters 0, the program should throw an exception and print an error message.
    public static double reciprocal(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Cannot compute reciprocal of zero.");
        }
        return 1.0 / number;
    }

    //task 2
    //Write a program that accepts an array of integers from the user and calculates the sum of its elements.
    // If the user enters a non-integer value, the program should throw an exception and print an error message.
    public static int sumOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int sum = 0;
        for (String part : parts) {
            try {
                int number = Integer.parseInt(part);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + part + "' is not a valid integer.");
            }
        }
        return sum;
    }

    //3 Write a program that reads two numbers from the user and divides them.
    // If the user enters 0 as the second number, the program should throw an exception and print an error message.
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
    //4 Write a program that reads a file name from the user and prints its contents to the console.
    // If the file does not exist or cannot be opened, the program should throw an exception and print an error message.

    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n--- Content of " + fileName + " ---");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--- End of File ---");

        } catch (IOException e) {
            System.err.println("\nError: Could not read the file '" + fileName + "'.");
            System.err.println("Please check if the file exists and you have permission to read it.");
        }
    }
 //????????


    //5 Write a program that reads an integer number and  calculates and prints its square root. If the number is  invalid or negative,
    // print "Invalid number". In all  cases finally print "Goodbye". Use try-catch-finally.

    public static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Invalid number");
            } else {
                double squareRoot = Math.sqrt(number);
                System.out.println("Square root: " + squareRoot);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Goodbye");
        }
    }

    //6 Create three new types of exceptions. Write a method that throws all three.
    //In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
    public static void throwCustomExceptions(int type) {
        switch (type) {
            case 1:
                throw new NewException1("This is NewException1");
            case 2:
                throw new NewException2("This is NewException2");
            case 3:
                throw new NewException3("This is NewException3");
            default:
                System.out.println("No exception thrown");
        }
    }
    //7
    //Write a program that prompts the user to enter their age. If the user enters an
    // age that is negative or greater than 120, the program should throw an exception and print an error message.

    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        System.out.println("Valid age: " + age);
    }



}
