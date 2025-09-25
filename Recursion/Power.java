public class Power {
    public static void main(String[] args) {
        int ans = power(2, 10);
        System.out.println(ans);
    }

    static int power(int a, int b){
        if (a == 0) return 0;
        if (b==0) return 1;
        if (b==1) return a;
        return a*power(a, b-1);
    }
}
