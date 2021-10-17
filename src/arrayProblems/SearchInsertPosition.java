package arrayProblems;

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int nums[] = {1,3,5,6};
		int target =2;
		
		int findpos = findpos(nums, target);
		System.out.println(findpos);
	}
	
	
	public static int findpos(int nums[], int target) {
		int low=0;
		int high=nums.length-1;
		int val=0;
		while (low<high) {
			
			int mid=(low+high)/2;
			System.out.println("Mid is "+ mid);
			if (nums[mid]==target) {
				val=mid;
				break;
			} else if (nums[mid]< target) {
				low=mid+1;
			} else if (nums[mid]> target) {
				high=mid-1;
			} 
		}
		return val;
	}
}
