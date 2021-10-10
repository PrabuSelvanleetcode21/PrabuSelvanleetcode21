package stringProblems;

public class IsStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcba";
		boolean palindrome = isPalindrome1(str);
		System.out.println("Output is "+ palindrome);
		
		String strArr[] = {"A", "Bc"};


	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
//		System.out.println(sb.toString());
		return str.equals(sb.toString());
	}
	
	public static boolean isPalindrome1(String str) {
//		int len=str.length()/2;
		
		int low=0;
		int end=str.length()-1;
		
		while(low<end) {
			if(str.charAt(low)!=str.charAt(end)) return false;
			low++;
			end--;
		}
		return true;
			
	}

}
