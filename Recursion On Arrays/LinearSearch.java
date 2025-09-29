public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int target = 5;
        int ans = linearSearch(a, target, 0);
        System.out.println(ans);
    }

    static int linearSearch(int[] a,int target, int i){
        if (a[i] == target) return i;
        if (i >= a.length-1) return -1;
        return linearSearch(a, target, i+1);
    }
}
