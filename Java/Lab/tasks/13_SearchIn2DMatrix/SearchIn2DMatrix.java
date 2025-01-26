import java.util.Scanner;

public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int i = 0; // start from the first row
        int j = cols - 1; // start from the last column

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true; // target found
            } else if (matrix[i][j] > target) {
                j--; // move left
            } else {
                i++; // move down
            }
        }

        return false; // target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix dimensions as input
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();

        // Create the 2D matrix
        int[][] matrix = new int[rows][cols];
        
        // Taking matrix elements as input
        System.out.println("Enter the elements of the matrix (sorted by row and column):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Taking the target element as input
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Search for the target element in the matrix
        boolean found = searchMatrix(matrix, target);
        
        // Output result
        if (found) {
            System.out.println("Target element " + target + " found in the matrix.");
        } else {
            System.out.println("Target element " + target + " not found in the matrix.");
        }

        scanner.close();
    }
}
