public class SumOfTwoMatrices {
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

        sumOfMatrices(a, b);
    }

    static void sumOfMatrices(int[][] a, int[][] b){
        System.out.println("Matrix sum: ");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                System.out.print(String.format("%5d", a[i][j] + b[i][j]));
                // System.out.print(a[i][j] + b[i][j] );
            }
            System.out.println();
        }     
    }
}
