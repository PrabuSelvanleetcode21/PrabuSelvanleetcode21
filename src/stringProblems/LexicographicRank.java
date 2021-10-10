package stringProblems;

public class LexicographicRank {
	


	public static void main(String[] args) {
		
		String str = "abc";
		
//		findLexicographicRank(str);
		
		int  num=6;
		int factorial = factrecursive(num);
		System.out.println("Factorial of num is "+ factorial);
		

	}
	
	public static int findLexicographicRank(String str) {
		
		int CHAR=256;
		int count[] =new int[CHAR];
		
		
		return 0;
	}

//	using normal way
	public static int factorial(int num) {
		int fact=1;
		for (int i=1; i<=num;  i++) {
			fact =fact*(i);
		}
		return fact;
 	}
	
//	using recursion
	public static int factrecursive(int num) {
		if (num==0) return 1;
		return num* factrecursive(num-1);
	}
}
