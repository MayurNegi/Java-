package arraysAndStrings;

import java.util.* ;

public class PrintSpiral {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		int rows = s.nextInt();
		int cols = s.nextInt();
		int matrix[][] = new int[rows][cols] ;
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				matrix[i][j] = s.nextInt();
			}
		}								// taking input of 2d matrix
		
		int count = 0;
		int rs = 0;
		int re = rows-1;
		int cs = 0;
		int ce = cols - 1;
		while(count <= rows*cols)
		{
			for(int j = cs; j<=ce; j++) {
				System.out.print(matrix[rs][j]);
				count++ ;
			}
			rs++ ;
			
			for(int i =rs; i<=re; i++) {
				System.out.print(matrix[i][ce]);
				count++;
			}
			ce-- ;
			
			for(int j=ce; j>=cs; j--) {
				System.out.print(matrix[re][j]);
				count++;
			}
			re--;
			
			for(int i=re; i>=rs; i--) {
				System.out.print(matrix[i][cs]);
			}
		cs++ ;
		}
		
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]);
			}
		}
	}

}
