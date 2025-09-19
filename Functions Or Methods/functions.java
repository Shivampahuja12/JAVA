import java.util.Scanner;

public class functions{

    static int sum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        int sum = n1+n2;

        return sum;
    }

    static String greet(){
        return "Hello, Welcome to My Code!!";
    }

    static String greet2(String name){
        return "Hello, "+ name;
    }

    static int sum2(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        // Q. take input of 2 numbers and print sum
        // System.out.println(greet());
        System.out.println(greet2("Shivam Pahuja"));
        // System.out.println("Sum = " + sum());
        // System.out.println("Sum2 = " + sum2(12, 30));
    }
}