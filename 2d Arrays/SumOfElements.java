import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        
        int[][] a = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum is " + elementsSum(a));
        
    }

    static int elementsSum(int[][] a){

        int sum = 0;
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                sum += a[i][j];
            }
        }

        // System.out.println("Sum of all the elements in the array is "+sum);

        return sum;
    }

}
