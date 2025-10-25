class IsNumberPalindrome {
    public static void main(String[] args) {
        int n = 123454321;
        int ans = palin(n, 0);
        System.out.println(n == ans ? "True" : "False");
    }

    static int palin(int n, int ans){

        if (n==0) return ans;
        ans = ans * 10 + n%10;
        return palin(n/10, ans);
    }
}