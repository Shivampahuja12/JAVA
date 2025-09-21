import java.util.Scanner;

public class DigitalRootSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(digitalSum(n));

    }

    static int digitalSum(int n){
        int x = n;
        while (x>10) {
            x = ans(n);
            if (x>=10){
                x = ans(x);
            }
        }
        return x;
    }

    static int ans(int n){
        if (n<10){
            return n;
        }
        return n%10 + ans(n/10);
    }
}
