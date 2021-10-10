package arrayProblems;

public class DuplicateZeros {

	public static void main(String[] args) {
		
//		int dup[] = {1,0,2,3,0,4,5,0};
//		int dup[] = {1,2,3};
		int dup[] = {0,0,0,0,0,0};
		
		int[] duplicateZeros = duplicateZeros(dup);
		for (int i=0;i<duplicateZeros.length; i++) {
			System.out.println(duplicateZeros[i]);
		}
	}
	
	public static int [] duplicateZeros(int[] arr) {
		int len=arr.length;
		for (int i=0; i<len-1; i++) {
			if (arr[i]==0) {
				for (int j=len-2;j>i; j--) {
					arr[j+1]= arr[j];
				}
				arr[i+1]=0;
				i++;
			}
		}
	return arr;	
	}
}
