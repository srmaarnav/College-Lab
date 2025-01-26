import java.util.Scanner;

public class ArrayOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Define a 2D integer array
        int[][] array = new int[rows][columns];

        // Taking input for each element of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Iterate through the 2D array using nested forEach loops
        System.out.println("Elements of the 2D array:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
