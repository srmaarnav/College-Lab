public class lab3 {
    public static void main(String[] args) {
        int[][] students = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        for (int[] row : students) {
            for (int number : row) {
                System.out.print(" " + number);
                sum += number;
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Number of rows: " + students.length);
        System.out.println("Number of columns: " + students[0].length);
    }
}
