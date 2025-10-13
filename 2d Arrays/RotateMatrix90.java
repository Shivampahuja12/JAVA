// import java.lang.reflect.Array;
import java.util.Arrays;
// import java.util.Collections;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] a = { {1,2,3}, {4,5,6}, {7,8,9}};

        int[][] res = transpose(a);

        int[][] main = rotate(res);

        a = main;
        System.out.println(Arrays.deepToString(a));

    }

    static int[][] transpose(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[j][i] = mat[i][j];
            }
        }

        return res;
    }

    static int[][] rotate(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int j = mat[0].length - 1; j >= 0; j--) {
                res[i][j] = mat[i][c++];
            }
        }

        return res;
    }

}
