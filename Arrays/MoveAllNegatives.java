import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllNegatives {
    public static void main(String[] args) {
        // int[] a = {1, -2, 3, -4, -5};   // → [-2, -4, -5, 1, 3]
        int[] a = {1, -2, 3, -4, -5, 2, 10, -12, 7};    // → [-2, -4, -5, -12, 1, 3, 2, 10, 7]

        // move1(a);
        move3(a);
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

    static void move2(int[] a){
        
        // if order doesn't matter 

        int j = -1;
        for (int i=0; i<a.length; i++){
            if (a[i] > 0){
                j = i;
                break;
            }
        }
        if (j==-1) return;

        for (int i=j+1; i<a.length; i++){
            if(a[i] < 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }

    static void move3(int[] a){

        // in this order matters - works like insertion sort...
        
        for (int i=0; i<a.length; i++){
            
            if (a[i] < 0){
                int k = i-1;
                int ele = a[i];
                
                while (k >= 0 && a[k] >= 0){
                    a[k+1] = a[k];
                    k--;
                }
                a[k+1] = ele;
            }


        }
    }
}
