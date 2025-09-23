import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // System.out.println(56);

        /* 
            printlin method first calls the valuesOf function and then it calls the toString function but we can override it by making our toString function of Arrays like - Arrays.toString(a); 
        */

        System.out.println(Arrays.toString(new int[]{2,4,6,7,34,12,54,6,45,}));
        
    }
}
