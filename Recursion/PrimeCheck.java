public class PrimeCheck {
    public static void main(String[] args) {
        int n = 14;
        boolean ans = primeRec(n, 2);
        if (ans == true) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    static boolean primeRec(int n, int st){
        if (n<2) return false;
        if (st==n) return true;
        if (n%st==0) return false;
        return primeRec(n, st+1);
    }
}
