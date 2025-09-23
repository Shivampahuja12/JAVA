import java.util.Scanner;

public class PrettyPrinting {
    public static void main(String[] args) {
        float f = 156.23505f;
        // System.out.printf("Formatted number is %.2f", f); // formatting with round off

        // System.out.print(Math.PI);


        
        /* 
        
            %c character
            %d decimal (integer) number (base 10)
            %e exponential floating-point number
            %f floating-point number
            %i integer (base 10)
            %o octal number (base 8)
            %s String
            %u unsigned decimal (integer) number
            %x number in hexadecimal (base 16)
            %t formats date/time
            %% print a percent sign
            \% print a percent sign  
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String m = sc.next();
        System.out.print("Enter last name: ");
        String s = sc.next();
        System.out.printf("Hello my first name is %s and my last name is %s",m, s);
    }
}
