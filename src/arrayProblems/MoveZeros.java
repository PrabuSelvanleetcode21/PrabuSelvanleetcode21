package arrayProblems;

public class MoveZeros {

	public static void main(String[] args) {
		
//		int nums[] = {0,1,0,3,12};
		int nums[] = {0,1};
		int[] zeroMove = zeroMove(nums);
		
		for (int i=0; i<zeroMove.length; i++) {
			System.out.println(zeroMove[i]);
		}
	}
	
	public static int[] zeroMove(int nums[] ) {
		int len=nums.length;
		if (len>1) {
			int zeros=0;
			for(int i=0; i<nums.length;i++) {
				if (nums[i]==0) zeros++;
			}
			int j=0;	
			for (int i=0; i<nums.length; i++) {
				if (nums[i]!=0) {
					nums[j]=nums[i];
					j++;
				}
			}
			for (int i=0;i<zeros;i++) {
				nums[j]=0;
				j++;
			}
			
		}
		return nums;
	}
}
