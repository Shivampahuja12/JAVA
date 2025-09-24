public class DiagonalSumSecondary {
    public static void main(String[] args) {
        int[][]a = {
            {1,2,10},
            {4,13,6},
            {7,8,9}
        };

        System.out.print(diagonalSumSecondary(a));
    }

    static int diagonalSumSecondary(int[][] a){
        int sum = 0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                if ((i+j) == (a.length-1)) {
                    sum += a[i][j];
                }
            }
        }     
        return sum;
    }
}
