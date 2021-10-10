package arrayProblems;

public class TransposeMatrix {
	public static void main(String[] args) {
		
		int matrix[][] = { 
//				{2,4,-1},
//				{-10,5,11},
//				{18,-7,6}
				{1,2,3},
				{4,5,6}
			};
		
		int[][] afterTranspose = afterTranspose(matrix);
		for(int i=0; i<afterTranspose.length; i++) {
			for (int j=0; j<afterTranspose[i].length; j++) {
				System.out.print(afterTranspose[i][j] +"   ");
			}
			System.out.println();
		}
	}
	
	public static int[][] afterTranspose(int matrix[] []) {
		int row=matrix.length;
         int col=matrix[0].length;
         
         if (row!=col) {
        	 int val=row;
        	 row=col;
        	 col=val;
         }
		int[][] temp = new int[row][col];
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				
				temp[i][j]=matrix[j][i];
			}
		}
	return temp;
	}

}
