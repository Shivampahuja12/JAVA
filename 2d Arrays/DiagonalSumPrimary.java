public class DiagonalSumPrimary {
    public static void main(String[] args) {
        int[][]a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.print(diagonalSumPrimary(a));
    }

    static int diagonalSumPrimary(int[][] a){
        int sum = 0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                if (i==j) {
                    sum += a[i][j];
                }
            }
        }     
        return sum;
    }
}
