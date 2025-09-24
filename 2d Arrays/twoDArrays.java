import java.util.Arrays;
import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {

        // int[][] a is the declaration of the 2d array and is stored in the stack, whereas new int[2][3] allocating the memory in the heap memory 
        int[][] a = new int[2][3]; // here adding rows size is mandatory but not the column size is mandatory

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter elements: ");
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
