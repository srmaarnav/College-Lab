import java.util.Scanner;

public class MaximalSquare {

    // Function to find the area of the largest square containing only 1's
    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // DP array to store the size of the largest square ending at (i, j)
        int[][] dp = new int[m][n];
        
        int maxSide = 0; // To store the side length of the largest square

        // Iterate over the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    // If not in the first row or first column
                    if (i > 0 && j > 0) {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    } else {
                        dp[i][j] = 1; // In the first row or first column, a 1 can only form a 1x1 square
                    }
                    maxSide = Math.max(maxSide, dp[i][j]); // Update the largest side length
                }
            }
        }

        // The area of the largest square
        return maxSide * maxSide;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();

        // Create and input the binary matrix
        char[][] matrix = new char[m][n];
        System.out.println("Enter the elements of the matrix (only 0's and 1's):");
        for (int i = 0; i < m; i++) {
            String row = scanner.next();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = row.charAt(j);
            }
        }

        // Find and print the area of the largest square
        int result = maximalSquare(matrix);
        System.out.println("The area of the largest square containing only 1's is: " + result);

        scanner.close();
    }
}
