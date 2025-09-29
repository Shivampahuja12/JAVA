public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] a = {};
        boolean ans = arraySorted(a,1);
        // boolean ans = arraySortedLinear(a);
        System.out.println(ans);

    }

    static boolean arraySorted(int[] a, int n){
        if (n>=a.length) return true;
        if (a[n] < a[n-1]) return false;
        return arraySorted(a, n+1);
    }

    static boolean arraySortedLinear(int[] a){
        for (int i=1; i<a.length; i++){
            if (a[i] < a[i-1]) return false;
        }
        return true;
    }
}
