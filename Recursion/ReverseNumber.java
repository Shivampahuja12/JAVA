public class ReverseNumber {
    public static void main(String[] args) {
        /* int ans = reverseNum(1505);
        System.out.println(ans); */

        /* int answer = reverseRecursion(145555, 0);
        System.out.println(answer); */


        int answer = reverseRecursion2(1234);
        System.out.println(answer);

    }
    static int reverseRecursion(int n, int ans){
        if (n==0) return ans;
        ans = ans * 10 + (n%10); 
        return reverseRecursion(n/10, ans);
    }

    static int reverseRecursion2(int n){
        if (n==0) return n;
        return (n%10 * 10) + reverseRecursion2(n/10);
    }

    static int reverseForLoop(int n){
        int ans = 0;
        int rem;

        for (int i=n; i>0; i=i/10){
            rem = i%10;
            ans = ans * 10 + rem;
        }
        return ans;
    }
}
