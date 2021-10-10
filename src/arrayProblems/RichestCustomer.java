package arrayProblems;

public class RichestCustomer {

	public static void main(String[] args) {
		
		int accounts[][] = { {1,2,3},{3,2,1} };
		int max=0;
		
		for (int i=0; i<accounts.length; i++) {
			int current=0;
			for(int j=0; j<accounts[i].length; j++) {
//				System.out.print(accounts[i][j]);
				current+=accounts[i][j];
			}
			System.out.println();
			if (current>max) max=current;
		}
		System.out.println("Maximum value is "+ max);
	}
}
