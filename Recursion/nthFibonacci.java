import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /* 
        //! Simple for loop
        int f = 0, f0 = 0, f1 = 1;
        for (int i=0; i<n; i++){
            f0 = f1;
            f1 = f;
            f = f0 + f1;
        } 
        System.out.println("Nth fibo is: " + f); 
           
        */


        /* 
        // ! recursion method
        int res = fibo(n);
        System.out.println(res); 
        */

    }
    
    static int fibo(int n){
        if (n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
