import java.util.ArrayList;

public class LinearSearchAllOcc {
    public static void main(String[] args) {
        int[] a = {5, 1, 5, 2, 5,3, 5,4,5, 5, 5, 9, 5};
        int target = 5;
        linearAllSearch(a, target, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void linearAllSearch(int[] a,int target, int i){
        if (a[i] == target){
            list.add(i);
        }
        if (i >= a.length-1) return;
        linearAllSearch(a, target, i+1);
    }
}
