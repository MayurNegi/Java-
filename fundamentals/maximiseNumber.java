package fundamentals;

import java.util.Scanner; 
import java.lang.Math ;

public class maximiseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt();
		
		    int num1 = n / 10 ;
	        int num2 = (n / 100)*10 + n % 10 ;
	        int num3 = (n / 1000)*100 + n % 100 ;
	        int num4 = n % 1000 ;
	        
	        System.out.println(Math.max(num1,Math.max(num2 , Math.max(num3, num4)))) ;
	}

}
