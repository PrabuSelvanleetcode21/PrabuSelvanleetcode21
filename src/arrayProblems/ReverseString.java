package arrayProblems;

public class ReverseString {

	public static void main(String[] args) {
		char rev[] =  {'h','e','l','l','o'};
		
		System.out.println("lenght is "+rev.length);
		int len=rev.length;
		for(int i=0;i <rev.length/2; i++) {
		 swap(rev, i, len-i-1);
		}
		
		for (int i=0; i<rev.length; i++) {
			System.out.println(rev[i]);
		}
		
	}
	
	private static void swap(char ch[],  int index1, int index2) {
		char temp=ch[index1];
		ch[index1] =ch[index2];
		ch[index2] = temp;
	}
}
