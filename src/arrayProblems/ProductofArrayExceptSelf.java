package arrayProblems;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		
//		int nums[] = {1,2,3,4};
		int nums[] = {-1,1,0,-3,3};
//		int[] productArraySelf = productArraySelf(nums);
//		for (int i=0; i<productArraySelf.length; i++) {
//			System.out.println(productArraySelf[i]);
//		}
		
		
		 int[] finalProduct = finalProduct(nums);
		 for (int i=0; i<finalProduct.length; i++) {
			 System.out.println(finalProduct[i]);
		 }
		
	
		
	}
	
//	Solution 1
	private static int [] productArraySelf(int arr[]) {
		int temp[] =new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			int val=1;
			for (int j=0; j<arr.length; j++) {
				if (i!=j) {
					val=val*arr[j];
				}
			}
			System.out.println(val);
			temp[i]=val;
		}
		return temp;
	}
	
//	Solution 2
	
	private static int [] finalProduct(int arr[]) {
		 int findProduct = findProduct(arr);
		 int temp[] =new int[arr.length];
		 int val = 0;
		 for(int i=0; i<arr.length; i++) {
			 try {
				  val = findProduct/arr[i];
				 temp[i]=val;
			 } catch (Exception e) {
				temp[i] =0;
			}
		 }
		 return temp;
	}
	
	private static int findProduct(int arr[]) {
		
		int prod=1;
		for (int i=0; i<arr.length; i++) {
			prod*=arr[i];
		}
		System.out.println("Prod is "+ prod);
		return prod;
	}
	
}
