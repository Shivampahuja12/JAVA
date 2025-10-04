import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllNegatives {
    public static void main(String[] args) {
        int[] a = {1, -2, 3, -4, -5};   // → [-2, -4, -5, 1, 3]

        move1(a);

        System.out.println(Arrays.toString(a));


    }

    static void move1(int[] a){

        // brute using extra space (least optimized)
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<a.length; i++){
            if (a[i] > 0){
                list.add(a[i]);
            }
        }


        int idx = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] < 0){
                a[idx++] = a[i];
            }
        }

        int k=0;
        for (int i=idx; i<a.length; i++){
            a[i] = list.get(k);
            k++;
        }
    }
}
