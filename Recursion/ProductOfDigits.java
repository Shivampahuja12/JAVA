import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitProduct(n));

    }

    static int digitProduct(int n){
        if (n<10){
            return n;
        }
        return n%10 * digitProduct(n/10);
    }
}
