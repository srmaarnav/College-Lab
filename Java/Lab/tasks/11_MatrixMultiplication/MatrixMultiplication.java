import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{   
            // Taking dimensions of the first matrix (A)
            System.out.print("Enter the number of rows for matrix A: ");
            int rowsA = scanner.nextInt();
            System.out.print("Enter the number of columns for matrix A: ");
            int colsA = scanner.nextInt();

            // Taking dimensions of the second matrix (B)
            System.out.print("Enter the number of rows for matrix B: ");
            int rowsB = scanner.nextInt();
            System.out.print("Enter the number of columns for matrix B: ");
            int colsB = scanner.nextInt();

            // Ensure that the number of columns in A equals the number of rows in B
            if (colsA != rowsB) {
                System.out.println("Matrix multiplication is not possible. Columns of A must be equal to rows of B.");
                return;
            }

            // Define matrices A and B
            int[][] A = new int[rowsA][colsA];
            int[][] B = new int[rowsB][colsB];

            // Taking input for matrix A
            System.out.println("Enter elements of matrix A:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }

            // Taking input for matrix B
            System.out.println("Enter elements of matrix B:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    B[i][j] = scanner.nextInt();
                }
            }

            // Matrix multiplication (C = A * B)
            int[][] C = new int[rowsA][colsB];

            // Perform multiplication
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Printing the result (matrix C)
            System.out.println("Resultant Matrix C (A * B):");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
        finally{
            scanner.close();
        }
    }
}
