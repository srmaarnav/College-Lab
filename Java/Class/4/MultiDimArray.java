public class MultiDimArray {
    public static void main(String[] args) {
        int[][] student = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                System.out.print(student[i][j] + " ");
            }
            System.out.println();
        }
    }
}
