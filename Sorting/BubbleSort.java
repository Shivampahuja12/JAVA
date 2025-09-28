import java.util.Arrays;

public class BubbleSort {

    /* 
        IN BUBBLE SORT there will be n-1 iterations where n is the size of the array
        also in this we will compare the adjacent elements
        lastly we will push the largest element to the back of the array (in-place)


        TC - O(n^2)
        SC - O(1)
    */
    public static void main(String[] args) {
        int[] a = {4,7,76,2,45,6,23,8,56,12,10};
        BubbleSorting(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void BubbleSorting(int[] a){
        for (int i=0; i<a.length; i++){

            boolean isSwap = false;

            for (int j=i+1; j<a.length; j++){
                if (a[i] > a[j]){
                    swap(a, i, j);
                    isSwap = true;
                }
            }

            if (!isSwap) { // array is already sorted
                return;
            }
        }
    }
}
