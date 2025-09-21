import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(DigitSum(n));

    }

    static int DigitSum(int n){
        if (n<10){
            return n;
        }
        return n%10 + DigitSum(n/10);
    }
}
