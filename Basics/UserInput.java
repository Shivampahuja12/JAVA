import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextByte();

        System.out.print("Enter your roll number: ");
        String rollno = sc.next();


        System.out.println("Hello " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll number: " + rollno);
    }
}
