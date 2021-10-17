package sortingProblems;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		int[] bsort = bsort(arr);
		
		for (int i=0 ;i<bsort.length; i++) {
			System.out.println(bsort[i]);
		}
		
	}
	
	public static int[] bsort(int arr[]) {
		
		for (int i=0 ;i <arr.length; i++) {
			
			for (int j=1; j<arr.length; j++) {
				
				if (arr[j-1]> arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
		return arr;
	}
	
	private static void swap(int arr[], int index1, int index2)  {
		int temp =arr[index1];
		arr[index1]= arr[index2];
		arr[index2]=temp;
	}
}
