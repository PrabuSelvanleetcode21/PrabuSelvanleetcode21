package arrayProblems;

public class GreaterElementRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {16,17,4,3,5,2};
		int arr[] = {};
//		o/p == {-1,16, 17,17,17,17}
//		o/p == { 17,17,5,5,5,2} 
//		int[] findGreaterElement = replaceGreaterElementincludesCurrentElement(arr);
		int[] findGreaterElement = replaceGreaterElementFromRightside(arr);
		
		for (int i=0; i<findGreaterElement.length; i++) {
			System.out.println(findGreaterElement[i]);
		}
	}
	
// O(n) Solution
	public static int[] replaceGreaterElement(int arr[]) {
		int len=arr.length;
		int max=arr[len-1];
		arr[len-1]=-1;
		for(int i=len-2; i>=0; i--) {
			int temp=arr[i];
			arr[i]=max;
			if (max < temp) max=temp;
		}
	return arr;
	}
	
public static int[] replaceGreaterElementincludesCurrentElement(int arr[]) {
		int len=arr.length;
		int max= arr[len-1];
		for (int i=len-2; i>=0; i--) {
			int temp=arr[i];
			if (max< temp) {
				max=temp;
			}
			arr[i]=max;
		}
		return arr;
	}
	
public static int[] replaceGreaterElementFromRightside(int arr[]) {
		if (arr==null) { 
			return arr ;
		}
		int max=arr[0];
		arr[0]=-1;
		
		for (int i=1;i<arr.length;i++) 
		{
			int temp=arr[i];
			arr[i]=max;
			if(max< temp) {
				max=temp;
			}
			
		}
		return arr;
	}

}
