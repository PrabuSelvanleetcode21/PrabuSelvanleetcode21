package arrayProblems;

public class RainWaterTrapping {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,0,1,2,0,4,1,2};
		
//		leftMax = {1,3,3,3,3,3,4,4,4}
//		rightMax= {4,4,4,4,4,4,4,2,2}
		
		int[] findleftMax = findleftMax(arr);
		int[] findrightMax = findrightMax(arr);
		int[] MinArray = new int[arr.length];
		for (int i=0; i<MinArray.length; i++) {
			int lmax= findleftMax[i];
			int rmax = findrightMax[i];
			int min = Math.min(lmax, rmax);
			int total= min - arr[i];
			System.out.println("total is "+ total);
		}
	}

//	total = total + Min (leftMax[i], rightMax[i]) - height[i]
//	Solution 1
	public static int[] findleftMax(int arr[]) {
		
		int len=arr.length;
		int  leftmax[] = new int[len];
		int lmax=arr[0];
		leftmax[0]= lmax;
		
		for (int i=1; i<len; i++) {
			
			if (arr[i]> lmax) {
				lmax=arr[i];
			}
			leftmax[i]=lmax;
		
		}
		return leftmax;
	}
	
	public static int[] findrightMax(int arr[]) {
		int len =arr.length;
		int rightmax[] = new int[len];
		int rmax=arr[len-1];
		rightmax[len-1] =rmax;
		for (int i= len-2; i>=0; i--) {
			 rightmax[i]=rmax;
			if (arr[i]>rmax) {
				rmax=arr[i];
				rightmax[i]=rmax;
			} 
		
		}
		return rightmax;
	}
	
	
}
