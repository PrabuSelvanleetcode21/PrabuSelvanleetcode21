package arrayProblems;

import java.util.Arrays;

public class ReArrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//					 e,o,e,o,e,o,e,o	
		int arr[] = {4,3,7,8,6,2,1};
//		int[] rearrange = rearrange(arr);
//		for (int i=0; i<rearrange.length; i++) {
//			System.out.println(rearrange[i] );
//		}
		
		int[] rearrange_with_out_sorting = rearrange_with_out_sorting(arr);
		for(int i=0; i<rearrange_with_out_sorting.length; i++) {
			System.out.println(rearrange_with_out_sorting[i]);
		}
		
	}

//	Using Solution
	public static int[]  rearrange(int arr[]) {
		Arrays.sort(arr);
		for (int i=0;i<arr.length-1; i+=2) {
//			System.out.println(arr[i]);
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
		}
		return arr;
	}
	
public static int[] rearrange_with_out_sorting(int arr[] ) {
		int temp=0;
		int len=arr.length-1;
		for (int i=0; i< arr.length; i++) {
		
			if(i%2 ==0 && i!=len) { 
				if (arr[i] > arr[i+1]) {
					  temp=arr[i];
					  arr[i]=arr[i+1];
					  arr[i+1] = temp;
				}
			} else if (i%2 ==1 && i!=len){
				if (arr[i]< arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
}
	
	public static void swap(int a, int b) {
		int c= a;
		 a=b;
		 b=c;
	}
 }
