package fundamentals;

import java.util.Scanner; 

public class patterns {

	

	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 
	 int i = 1 ;
	 while(i <= n) {
		
		 for(int j =  1; j<= n ; j++) {
			 System.out.print(n - j + 1);
		 }
		 i += 1 ;
		 System.out.println( );
	 }
 } 	
}
