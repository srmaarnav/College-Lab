import java.util.Scanner;

public class SquareArrayElements {
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

        // Square each element in the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }

        // Print the modified array using forEach loop
        System.out.println("Modified array (squared elements):");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
