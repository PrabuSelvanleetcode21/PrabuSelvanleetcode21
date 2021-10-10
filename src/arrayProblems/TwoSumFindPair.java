package arrayProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumFindPair {
	public static void main(String[] args) {
		
		int arr[] = {2,1,7,8,4,6,5};
		
		int target= 12;
		
		usinghashmap(arr, target);
//		int[] bruteforce = twpptrapproach(arr, target);
//		
//		for (int i=0;i<bruteforce.length;i++) {
//			System.out.println(bruteforce[i]);
//		}
		
	}
	
	public static int[] twpptrapproach( int arr[], int target ) {
		int low= 0;
		int high=arr.length-1;
		int temp[] = new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		while (low< high) {
			int add =arr[low] + arr[high];
			if (add < target) {
				low++;
			} else if (add> target) {
				high--;
			} else if (add==target) {
				temp[j]= arr[low];
				++j;
				temp[j] =arr[high];
				++j;
				low++;
				high--;
//				break;
			}
		}
		return temp;
	}
	
	public static void usinghashmap (int arr[], int target) {
		
		HashMap<Integer, Integer> hmap = new  HashMap<Integer, Integer>();
		for (int i=0;i<arr.length; i++) {
			int curr = target-arr[i];
			if (!hmap.containsKey(curr)) {
				hmap.put(arr[i], i);
			} else {
				System.out.println(arr[i]);
				System.out.println(curr);
			}
		}
		
	}
}
