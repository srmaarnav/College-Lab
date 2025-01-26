import java.util.Scanner;

public class FindMaxElement {
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

        // Initialize a variable to hold the maximum value
        int max = numbers[0];

        // Iterate through the array using forEach loop
        for (int number : numbers) {
            // Update max if the current element is greater
            if (number > max) {
                max = number;
            }
        }

        // Print the maximum element
        System.out.println("Maximum element in the array: " + max);

        scanner.close();
    }
}
