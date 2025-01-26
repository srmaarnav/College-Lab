import java.util.Scanner;

public class ArrayIteration {
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
        System.out.println("Array elements:");
        for (int number : numbers) {
            // Print each element
            System.out.println(number);
        }

        scanner.close();
    }
}
