public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
            { 7, 2, 5 },
            { 1, 9, 4 },
            { 6, 3, 8 }
        };

        int[][] b = {
            { 4, 8, 2 },
            { 5, 1, 7 },
            { 9, 6, 3 }
        };

        matrixMultiplication(a, b);
    }

    static void matrixMultiplication(int[][] a, int[][] b){
        int row1 = a.length;
        int col1 = a[0].length;
        int row2 = b.length;
        int col2 = b[0].length;

        // Check if multiplication is possible
        if (col1 != row2){
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        // Result matrix
        int[][] c = new int[row1][col2];

        // Multiply
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result Matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
