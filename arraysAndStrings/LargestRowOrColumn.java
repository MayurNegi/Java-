package arraysAndStrings;

import java.util.Scanner ;

public class LargestRowOrColumn {

	static Scanner s = new Scanner(System.in) ;
	
public static int[][] take2dInput(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void largestSum(int[][] arr) {
		int m = arr.length ;
		int n = arr[0].length ;
		 
		int rindex = -1, cindex = -1 ;
		int rlargest = Integer.MIN_VALUE , clargest = Integer.MIN_VALUE;  
		
		// row sum 
		for(int i =0; i<n; i++) {
			int rsum = 0 ;
			for(int j=0; j<m; j++)
			{
				rsum += arr[i][j] ;
			}
			if(rsum > rlargest) {
				rlargest = rsum;
				rindex = i ;
			}
		}
		// column sum
		for(int j =0; j<m; j++)
		{
			int csum = 0;
			for(int i=0 ; i<n; i++)
			{
				csum += arr[i][j] ;
			}
			if(csum > clargest) {
				clargest = csum;
				cindex = j ;
			}
		}
		
		if(rlargest >= clargest) {
			System.out.print("row" + rindex + rlargest) ;
		}
		else {
			System.out.println("column" + cindex + clargest );
		}
	}
	
	
	public static void main(String[] args) {
		int input[][] = take2dInput() ;
		largestSum(input) ;
	}

}
