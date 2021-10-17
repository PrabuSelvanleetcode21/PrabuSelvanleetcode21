package arrayProblems;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
//		int arr[] = {1,2,3,4};
		int arr[] = {1,1,1,3,3,4,3,2,4,2};
		
//		boolean duplicate = isDuplicate(arr);
		boolean duplicate = isDuplicate1(arr);
		System.out.println(duplicate);
	}
	
//	Solution1
	
	public static boolean isDuplicate(int arr[]) {
		boolean flag= false;
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
		}
		return flag;
	}

public static boolean isDuplicate1(int nums[]) {
	Arrays.sort(nums);
	boolean flag=false;
	for (int i=1;i<nums.length; i++) {
		if (nums[i]==nums[i-1]) {
			flag  =true;
			break;
		}
	}
	return flag;
}
}