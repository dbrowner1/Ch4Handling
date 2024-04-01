/**Class: AdditionCalculator
 * @author D Browner
 * @version 1.6
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2024
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter first integer
        System.out.print("Enter first integer: ");
        int num1 = getNextInt(scanner);

        //prompt user to enter second integer
        System.out.print("Enter the second integer: ");
        int num2 = getNextInt(scanner);

        //calculate sum
        int sum = num1 + num2;

        //Print result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    //Method to get next integer input from user
    private static int getNextInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // Clear the buffer
                scanner.next();
                System.out.println("Error: Enter valid integer value.");
                System.out.print("Try again: ");
            }
        }
    }
}
