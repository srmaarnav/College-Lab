import java.util.Scanner;

public class FilterOddNumbers {
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

        // Iterate through the array using forEach loop
        System.out.println("Odd numbers in the array:");
        for (int number : numbers) {
            // Check if the number is odd
            if (number % 2 != 0) {
                // Print the odd number
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
