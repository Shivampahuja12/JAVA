public class BinaryEquivalent {
    public static void main(String[] args) {
        int n = 10;
        int ans = binaryEquivalent(n);
        System.out.println(ans);
    }
    static int binaryEquivalent(int n){
        if (n==0) return 0;
        return (n%2) + 10 * binaryEquivalent(n/2);
    }
}