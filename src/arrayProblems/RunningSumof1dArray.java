package arrayProblems;

public class RunningSumof1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int nums[] = {1,2,3,4};
		int  nums[] = {1,1,1,1,1};
		for (int i=1; i<nums.length; i++) {
			int curr= nums[i-1]+ nums[i];
			nums[i]= curr;
		}
		
		for  (int j=0; j<nums.length; j++) {
			System.out.println(nums[j]);
		}
	}

}
