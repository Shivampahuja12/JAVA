import java.util.Arrays;

public class SelectionSort {

	/* 
		IN SELECTION SORT we can imagine a sorted array and an unsorted array
		we have to pick the smallest element from the unsorted array and put 
		it in the sorted array in n-1 iterations
	*/
	public static void main (String[] args){
		int[] a = {4,1,5,2,3};
		// SelectionSorting(a);
		selectionSortPractice(a);
		System.out.println(Arrays.toString(a));
		selectionSortPractice2(a);
		System.out.println(Arrays.toString(a));
	}

	static void SelectionSorting(int[] a){
		int j;
		int n = a.length;
		for (int i=0; i<n-1; i++){
			// find the max/min in the remaining array and swap with the correct index
			// here i am doing it with min

			int smallestIdx = i;
			for (j=i+1; j<n; j++){
				if (a[j] < a[smallestIdx]){
					smallestIdx = j;
				}
			}

			swap(a, smallestIdx, i);	
		}
	}

	static void selectionSortPractice2(int[] a){
		for (int i=0; i<a.length-1; i++){
			int sIdx = i;
			for (int j=i+1; j<a.length; j++){
				if (a[j] > a[sIdx]){
					sIdx = j;
				}
			}
			swap(a, sIdx, i);
		}
	}

	static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	static void selectionSortPractice(int[] a){
		int n = a.length;
		for(int i=0; i<n-1; i++){
			int smlIdx = i;
			for (int j=i+1; j<n; j++){
				if (a[smlIdx] > a[j]){
					smlIdx = j;
				}
			}
			swap(a, smlIdx, i);
		}
	}
}