public class RowWiseSum {
    public static void main(String[] args) {

        int[][]a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rowsSum(a);
    }

    static void rowsSum(int[][] a){
        int sum;
        for (int i=0; i<a.length; i++){
            sum = 0;
            for (int j=0; j<a[0].length; j++){
                sum += a[i][j];
            }
            System.out.println("Sum of " + i +"th row is " + sum);
        }
    }
}
