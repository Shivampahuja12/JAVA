public class CountZerosInNum {
    public static void main(String[] args) {
        int n = 20000000;
        int ans = countZeros(n, 0);
        System.out.println(ans);
    }

    static int countZeros(int n, int count){
        if (n==0) return count;
        if (n%10 == 0) count++;
        return countZeros(n/10, count);
    }
}
