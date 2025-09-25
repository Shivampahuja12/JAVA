public class Palindrome {
    public static void main(String[] args) {
        int a = 12321;
        // boolean ans = checkPalindromeFor(a);
        // if (ans) System.out.println("Palindrome");
        // else System.out.println("Not palin");

        int rec = checkPalindromeRec(a, 0);
        if (rec == a) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }


    static boolean checkPalindromeFor(int a){
        int n = a;
        int rev = 0;
        for (int i=a; i>0; i=i/10){
            int rem = i%10;
            rev = rev * 10 + rem;
        }
        if (rev == n) return true;
        else return false;
    }

    static int checkPalindromeRec(int a, int temp){
        if (a==0) return temp;
        temp = temp * 10 + a%10;
        return checkPalindromeRec(a/10, temp);

    }
}


