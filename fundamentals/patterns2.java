package fundamentals;

import java.util.Scanner; 

public class patterns2 {
	public static void main(String[] args) {
		//Your code goes here
         Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 
	 int i = 1 ;
	 while(i <= n) {
		 char ch = (char)('A' + n - i ) ;
		 for(int j =  1; j<= i ; j++) {
			 
			 System.out.print(ch);
             ch = (char) (ch+1);
		
		 }
		 i += 1 ;
		 System.out.println( );
	 }
	
	// public static void main(String args[]) {
//
//	 Scanner s = new Scanner(System.in);
//	 int n = s.nextInt();
//	 
//	 int i = 1 ;
//	 while(i <= n) {
//		
//		 for(int j =  1; j<= n ; j++) {
//			 char ch = (char)(64 + j) ;
//			 System.out.print(ch);
//		
//		 }
//		 i += 1 ;
//		 System.out.println( );
//	 }
//	 Scanner s = new Scanner(System.in);
//	 int n = s.nextInt();
//	 
//	 int i = 1 ;
//	 while(i <= n) {
//		
//		 for(int j =  1; j<= n ; j++) {
//			 System.out.print(n - j + 1);
//		 }
//		 i += 1 ;
//		 System.out.println( );
//	 }
 } 	
}
