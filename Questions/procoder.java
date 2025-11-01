public class procoder {
    public static void main(String[] args) {
        // print1toN(10);
        // printNto1(10);
        // allEven1toN(100);
        // sumOfN(500000000);
        // fact(5);
        // sumOfEvenToN(10);
        // squaresFrom1toN(5);
        
    }

    static void print1toN(int n){
        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }

    static void printNto1(int n){
        for (int i=1; i<=n; i++){
            System.out.print(n + 1 - i + " ");
        }
    }

    static void allEven1toN(int n){
        /* for (int i=0; i<=n; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        } */

        for (int i=0; i<=n; i+=2){
            System.out.print(i+" ");
        }
    }

    static void sumOfN(int n){
        int sum = 0;

        long start = System.nanoTime();
        // for (int i=1; i<=n; i++){
        //     sum += i;
        // }
        
        
        sum = (n*(n+1))/2;
        long end = System.nanoTime();


        System.out.println(end - start);

        // System.out.println(sum);
    }

    static void fact(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;
        }


        System.out.println(fact);
    }

    static void sumOfEvenToN(int n){
        int sum = 0;
        /* for (int i=1; i<=n; i++){
            if (i%2==0) sum += i;
        } */

        sum = (n/2) * ((n/2)+1);
        System.out.println(sum);
    }

    static void squaresFrom1toN(int n){
        for (int i=1; i<=n; i++){
            System.out.print(i*i + " ");
        }
    }
}
