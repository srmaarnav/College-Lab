import java.util.Scanner;

public class StringLengthCheck {
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

        // Iterate through the array using forEach loop
        System.out.println("Length of each string:");
        for (String str : strings) {
            // Print the string and its length
            System.out.println("String: \"" + str + "\", Length: " + str.length());
        }

        scanner.close();
    }
}

