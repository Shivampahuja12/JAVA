import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + "b");
        System.out.println("a" + 'b');
        System.out.println('a' + 3);    // a is a character so 3 is added to its ascii or (unicode maybe) value
        System.out.println("a" + 1);    // integer will be converted to Integer that will call toString()

        System.out.println("Shivam" + new ArrayList<>());
        // System.out.println("Shivam" + new Integer(30));     // deprecated/ removal

        System.out.println(1+"a"+ 2);
        System.out.println(1+2+3+"a");


        // + operator is always used with string with something else like (primitives, objects etc.)


    }
}
