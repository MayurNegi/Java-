package fundamentals;

import java.util.Scanner; 

public class patterns3 {
	
	public static void main(String[] args) {
		// Write your code here
		 Scanner s = new Scanner(System.in) ;
	        int n = s.nextInt();
	        
	        for(int i = 1 ; i <= n ; i++)
	        {
	            for(int j= n ; j< i; j--)
	            {
	                System.out.print(j) ;
	            }
	            System.out.print("*");
	            
	            for(int k = i - 1; k <= 1 ; k--)
	            {
	                System.out.print(k) ;
	            }
	            
	            System.out.println() ;
	        }
                   
	}
        
}


