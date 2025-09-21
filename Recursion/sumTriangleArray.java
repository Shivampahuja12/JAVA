import java.util.Arrays;
public class sumTriangleArray {
    public static void main(String[] args) {
        int[] a = {1,6,3};
        sumTriangle(a);
    }

    static void sumTriangle(int[] a){

        
        if (a.length < 1){
            return;
        }
        
        int[] ano = new int[a.length-1];

        for (int i=0; i<a.length-1; i++){
            int x = a[i] + a[i+1];
            ano[i] = x;
        }
        
        sumTriangle(ano);

        System.out.println(Arrays.toString(a));

    }
}
