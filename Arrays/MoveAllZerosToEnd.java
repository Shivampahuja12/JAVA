import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] a = {1, 0 ,2 ,3 ,0 ,4 ,0 ,1};
        
        move1(a);
        System.out.println(Arrays.toString(a));
    }

    static void move1(int[] a){

        // brute
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i] == 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
