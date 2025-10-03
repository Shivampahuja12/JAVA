public class GCD {
    static int gcd(int a, int b) {
        /* int min = i < j ? i : j;

        boolean ans1 = primeCheck(i);
        boolean ans2 = primeCheck(j);
        if (ans1 == true && ans2 == true) {
            return 1;
        }

        return helper(i, j, min); */


        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    static int helper(int i, int j, int min) {
        if (i % min == 0 && j % min == 0) {
            return min;
        }
        return helper(i, j, min - 1);
    }

    static boolean primeCheck(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(gcd(5, 10));
    }
}
