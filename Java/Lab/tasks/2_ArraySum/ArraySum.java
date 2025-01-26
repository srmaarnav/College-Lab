import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Define an integer array
        int[] numbers = new int[size];

        // Taking array elements input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize a variable to hold the sum
        int sum = 0;

        // Iterate through the array using forEach loop
        for (int number : numbers) {
            // Add each element to the sum
            sum += number;
        }

        // Print the sum of the array elements
        System.out.println("Sum of array elements: " + sum);

        scanner.close();
    }
}
