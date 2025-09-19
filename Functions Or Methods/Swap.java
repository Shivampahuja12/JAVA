public class Swap {
    // Functions are always pass by value in java and never pass by reference

    // Primitives are just pass by value, 
    // Object and string: passing value of the reference variable
    static void swapUsingThirdVariable(int a, int b){
        // int t = a;
        // a = b;  
        // b  = t; 

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapUsingThirdVariable(a, b);
        // b = a + b - (a = b);  // swap two numbers 
        System.out.println("a = " + a + ", b = " + b );
    }
}
