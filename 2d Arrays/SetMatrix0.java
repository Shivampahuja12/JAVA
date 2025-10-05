import java.util.Arrays;

public class SetMatrix0 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 0},
            {7, 8, 9}
        };

        setzerorowcol(a);

        System.out.println(Arrays.deepToString(a));

    }

    static void setzerorowcol(int[][] a){

        int[] row = new int[3];
        int[] col = new int[3];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                if (a[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // System.out.println(Arrays.toString(row));
        // System.out.println(Arrays.toString(col));


        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                if (row[i] == 1){
                    a[i][j] = 0;
                }
            }
        }

        for (int i=0; i<a[0].length; i++){
            for (int j=0; j<a.length; j++){
                if (col[j] == 1){
                    a[i][j] = 0;
                }
            }
        }



    }
}
