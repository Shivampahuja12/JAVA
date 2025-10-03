import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
public class PrimeFactors{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=2){
            primeFacts(n, 2);
        }
    }

    
    static void primeFacts(int n, int i){
        if (n==1) return;
        /* if (n%i==0){
            n=n/i;
        }
        else {
            i++;
            n=n/i;
        } */

        if (n % i == 0){
            System.out.println(i);
            primeFacts(n / i, i); // keep dividing by same factor
        } 
        else {
            primeFacts(n, i + 1); // try next factor
        }
        // System.out.println(i);
        // primeFacts(n, i);    
    }
}
