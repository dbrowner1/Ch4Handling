import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {

    public static void main(String[] args) {
        //generate an array of "50" double values
        double[] array = generateRandomArray(50);

        //Prompt user to enter an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index between 0 and 49: ");
        int index = scanner.nextInt();

        try {
            //print value at specified index
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range.Enter a valid index between 0 and 49.");
        }
    }

    // Method to generate an array of random double values
    private static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
}
