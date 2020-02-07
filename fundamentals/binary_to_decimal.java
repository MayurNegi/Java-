package fundamentals;

import java.util.Scanner;
import java.lang.Math ;

public class binary_to_decimal {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        int dec = 0 ;
         int i =0 ;
        
        for( ;n > 0;n = n/10)
        {
           
            int mod = n % 10 ;
            int temp = (int)(mod * Math.pow(2 , i) ) ;
            dec = dec + temp ;
            i++ ;
        }
        System.out.println(dec) ;
	}
}
