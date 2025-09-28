import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        // TC - O(n^2)
        int[] a = {4,1,5,2,3,67,45,23,12,11};

        insertionSorting(a);
        System.out.println(Arrays.toString(a));

    }

    static void insertionSorting(int[] a){
        int n = a.length;
        for (int i=1; i<n; i++){
            int curr = a[i];
            int prev = i-1;

            while (prev >= 0 && a[prev] > curr){
                a[prev+1] = a[prev];
                prev--;
            }

            a[prev+1] = curr; // placing the curr element in its correct position
        }
    }
}
