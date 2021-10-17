package sortingProblems;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		
		int[] selSort = selSort(arr);
		
		System.out.println(Arrays.toString(selSort));
		
//		for (int i=0; i<selSort.length; i++) {
//			System.out.println(selSort[i]);
//		}
}

	public static int[] selSort(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			int min_index=i;
			for (int j=i+1; j<arr.length; j++) {
				
				if(arr[j]< arr[min_index]) 
					min_index=j;
				
			}
			swap(arr, min_index, i);
		}
		
		return arr;
	}
	
	public static void swap(int arr[] , int index1,int index2) {
		int temp=arr[index1];
		arr[index1]= arr[index2];
		arr[index2] = temp;
	}
}