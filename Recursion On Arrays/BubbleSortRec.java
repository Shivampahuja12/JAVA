import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 2, 3, 132, 2, 0, -2, -23};
        
        bubRecIteration(a, 0, 0);

        System.out.println(Arrays.toString(a));
    }

    static void bubRecIteration(int[] a, int i, int j){

        if (i == a.length-1) return;

        if (j < a.length - i - 1){
            recInside(a, j);
        }

        bubRecIteration(a, i+1, j);
    }

    static void recInside(int[] a, int i){
        if (i == a.length-1) return;

        if (a[i] > a[i+1]) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        recInside(a, i+1);
    }
}