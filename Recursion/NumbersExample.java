public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 5 4 3 2 1
        // print first 5 numbers: 1,2,3,4,5
        /* print1(69);
        print1(69);
        print1(69);
        print1(69);
        print1(69); */

        print2(5);
    }
    static void print1(int n){
        System.out.println(n);
    }

    static void print2(int n){
        if (n==0) return;
        System.out.print(n + " ");
        print2(n-1);

    }
}
