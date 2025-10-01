import java.util.Arrays;

public class MergeSort {

    /* 
        1. divide array into 2 parts
            get both parts sorted via recursion
        2. merge the sorted parts. 
    */
    public static void main(String[] args) {
        int[] a = {8,3,4,12,5,6}; 
        // int[] ans = mergeSort(a);
        int[] ans = mergeSortPractice(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] a){
        if (a.length == 1){
            return a;
        }
        int mid = a.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] sec){
        int[] merged = new int[first.length + sec.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<first.length && j<sec.length){
            if (first[i] < sec[j]){
                merged[k] = first[i];
                i++;
            }
            else {
                merged[k] = sec[j];
                j++;
            }
            k++;
        }


        // copy the remaining elements
        while (i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }

        while (j < sec.length) {
            merged[k] = sec[j];
            j++;
            k++;
        }

        return merged;
    }

    static int[] mergeSortPractice(int[] a){
        if (a.length == 1) return a;

        int mid = a.length/2;
        int[] left = mergeSortPractice(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSortPractice(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    static int[] mergePractice(int[] left, int[] right){
        int[] merged = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;

        while (i<left.length && j<right.length){
            if (left[i] < right[j]){
                merged[k++] = left[i++];
            }
            else {
                merged[k++] = right[j++];
            }
        }


        while (i<left.length){
            merged[k++] = left[i++];
        }

        while (j<right.length){
            merged[k++] = right[j++];
        }


        return merged;
    }

}
