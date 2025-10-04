import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] a = {1, 0 ,2 ,3 ,0 ,4 ,0 ,1};
        // int[] a = {0};
        
        // move1(a);
        // move2(a);
        move3(a);
        System.out.println(Arrays.toString(a));
    }

    static void move1(int[] a){

        // brute
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i] == 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void move2(int[] a){
        // optimized - two pointer/ in-place overwrite approach
        //! not a proper two pointer approach

        int idx = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] != 0){
                a[idx++] = a[i];
            }
        }
        for (int i=idx; i<a.length; i++){
            a[i] = 0;
        }
    }

    static void move3(int[] a){
        // * exact two pointer approach
        // int i;
        int j=-1;

        for (int i=0; i<a.length; i++){
            if (a[i] == 0){
                j = i;
                break;
            }
        }

        if (j==-1) return;

        for (int i=j+1; i<a.length; i++){
            if (a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
}
