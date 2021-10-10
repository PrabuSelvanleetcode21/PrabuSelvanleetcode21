package arrayProblems;

public class ThreeConsecutiveOdds {

	public static void main(String[] args) {
		
		int arr[] = {2,6,4,1};
//		int arr[] = {1,2,34,3,4,5,7,23,12};
		boolean threeodds = threeodds(arr);
		System.out.println(threeodds);
		
		
	}
	
	public static boolean threeodds(int arr[]) {
		int count=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				count++;
			} else {
				count=0;
			}
		if (count ==3) return true;
		}
		return false;
	}
}
