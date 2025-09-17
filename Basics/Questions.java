import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        // System.out.println(checkArmstrong(n));
        printArmstrong();
    }

    // check a number is armstrong or not
    static boolean checkArmstrong(int n){
        int originalNum = n;
        String strnum = String.valueOf(n);
        int len = strnum.length();
        int arm = 0;
        while (n>0){
            int rem = n%10;
            arm += Math.pow(rem, len);
            n/=10;
        }
        if (arm == originalNum) return true;
        else return false;
    }

    // print all the three digit armstrong numbers 
    static void printArmstrong(){

        /* int i=100;
        String strnum = String.valueOf(i);
        int len = strnum.length();
        int arm = 0;
        int j;
        while (i<=999){
            arm = 0;
            j = i;
            while (j>0){
                int rem = j%10;
                arm += Math.pow(rem, len);
                j/=10;
                // System.out.print(arm + " ");
            }
            if (arm == i) System.out.print(arm + " ");
            i++;
        } */

        // OR
        for (int i=100; i<1000; i++){
            if (checkArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    // prime number
    static boolean isPrime(int n){

        if (n==0 || n==1) return false; 
        /* for (int i=2; i*i<=n; i++){
            if (n%i==0) return false;
        } */
        int i = 2;
        while (i*i<=n){
            if (n%i==0) return false;
            i++;
        }
        return true;
    }
}
