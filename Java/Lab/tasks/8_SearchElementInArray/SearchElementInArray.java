import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of strings: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Define a string array
        String[] strings = new String[size];

        // Taking array elements input
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            strings[i] = scanner.nextLine();
        }

        // Taking the element to search for
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        // Initialize a flag to check if the element is found
        boolean found = false;

        // Iterate through the array using forEach loop
        for (String str : strings) {
            if (str.equals(searchString)) {
                found = true;
                break; // Exit the loop as soon as the element is found
            }
        }

        // Print the result
        if (found) {
            System.out.println("The string \"" + searchString + "\" exists in the array.");
        } else {
            System.out.println("The string \"" + searchString + "\" does not exist in the array.");
        }

        scanner.close();
    }
}
