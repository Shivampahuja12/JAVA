
public class binarySearchRecursion {
    public static void main(String[] args) {

        int[] a = {1,3,5,7,11,34,67,87,99};
        int target = 11;
        int lo = 0;
        int hi = a.length-1;
        int res = binarySearchRecursion1(a, target, lo, hi);
        int res2 = binarySearchRecursion2(a, target, lo, hi);
        System.out.println(res);
        System.out.println(res2);
    }

    static int binarySearchRecursion1(int[] a, int target, int lo, int hi){

        int mid;
        while (lo<=hi){
            mid = lo + (hi-lo)/2;
            if (a[mid] == target){
                return mid;
            }
            else if (a[mid] > target){
                return binarySearchRecursion1(a, target, lo, mid-1); // here it is important to write return before function call because what will be the value will also be returned from where it is called
            }
            else if (a[mid] < target){
                return binarySearchRecursion1(a, target, mid+1, hi);
            }
        }
        return -1;
    }
    
    static int binarySearchRecursion2(int[] a, int target, int lo, int hi){
    
        if (lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if (a[mid] == target) return mid;
        else if (a[mid] > target) return binarySearchRecursion1(a, target, lo, mid-1);
        else return binarySearchRecursion1(a, target, mid+1, hi);
    }
}
