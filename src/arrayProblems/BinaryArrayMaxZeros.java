package arrayProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BinaryArrayMaxZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,1,1,1,0,1,0,1,0,1};
//		maxZerosFlipped(arr);
		maxZerosFlippedWithExtraArray(arr);
	}
	
	public static void maxZerosFlipped(int arr[] ) {
		int val=-1;
		int max=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==0) {
				for (int j=i+1; j<arr.length; j++) {
					if (arr[j]==0) {
						max= j-i;
						break;
					}
				}	
				
			}
			
			if(max> val) {
				val=max;
				System.out.println("Val is "+ val);
			}
		}
	}
	
	public static void maxZerosFlippedWithExtraArray(int arr[]) {
		
		int temp[]= new int[arr.length];
		int k=-1;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==0) {
				temp[++k]=i;
//				k++;
			}
		}
		
		int max=-1;
		for(int i=1; i<temp.length;i++) {
//			System.out.println(temp[i]);
			int val= temp[i]-temp[i-1];
			if (val>max) {
				max=val;
			}
		}
		
		System.out.println("Max consecutive max is "+ max);
	}
}
