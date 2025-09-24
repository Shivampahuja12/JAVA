public class SearchInMatrix {
    public static void main(String[] args) {
        int[][]a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int target = 12;
        searchInMatrix(a, target);
    }

    static void searchInMatrix(int[][] a, int target){
        boolean flag = true;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                if (target == a[i][j]){
                    flag = false;
                    System.out.println("Element {" + target + "} found at position: a[" + i+ "][" + j +"]");
                    break;
                }
            }
        }
        if(flag) System.out.println("Element not found");
    }

}
