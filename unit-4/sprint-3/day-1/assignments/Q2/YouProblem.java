package Matrixes;

public class YouProblem {
	public static void main(String[] args) {
	// create 2d array with 2 row 3col with element 0,2,3,4,5,6
		int row=2;
		int col=3;
		int [][] matrix=new int[row][col];
		
		int values=0;
	for(int i=0; i<row; i++) {
		for(int j=0; j<col;j++) {
			matrix[i][j]=values;
			values++;
		}
	}
	
	// printing matrix now
	for(int i=0; i<row; i++) {
		String s="";
		for(int j=0; j<col; j++) {
			s+=(matrix[i][j]+" ");
		}
		System.out.println(s);
	}
	
	
	}

}
