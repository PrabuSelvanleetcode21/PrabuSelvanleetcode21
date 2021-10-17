package arrayProblems;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[] = {3,0,1};
		int nums[] = {9,6,4,2,3,5,7,0,1};
//		int nums[] = {0};
//		int nums[] = {0,1};
		
		findMissing(nums);
	}
	
	public static void findMissing(int nums[]) {
		
		boolean flag=false;
		int max =0;
		HashSet<Integer> hset=  new HashSet<Integer>();
		for (int i=0; i<nums.length; i++) {
			hset.add(nums[i]);
			if(nums[i] >= max) {
				max=nums[i];
			}
		}
		for (int i=0; i<=max; i++) {
			if(!hset.contains(i)) {
				System.out.println(i);
				flag=true;
				break;
			}
		}
		if (flag==false) {
			System.out.println(max+1);
		}
	}
	
//	approach2 
//	Find the max element
//	Sum the array elements
//	Sum the 0 to max elements
//	subtract the max elements from the sum 
	
//	public static void findMissing(int nums[]) {
//		
//		int max=0;
//		int sumofArrayElements =0;
//		for (int i=0; i < nums.length; i++) {
//			sumofArrayElements+=nums[i];
//			if (nums[i]> max) {
//				max=nums[i];
//			}
//		}
//		int total=0;		
//		for (int i=0; i<=max; i++) {
//			total+=i;
//		}
//		int missingnumber = total-sumofArrayElements;
//		System.out.println("Missing Number is "+ missingnumber);
//	}

}
