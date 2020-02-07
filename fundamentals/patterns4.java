package fundamentals;

import java.util.Scanner; 

public class patterns4 {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int lststar = 1 ;
        int lststar2 = 1;
        
        for(int i = 1; i <= n + 1; i++)
        {
                System.out.print("*");
            
                for(int num1 = 1;num1 < i ;num1++)
                {
                    System.out.print(num1) ;
                }
                
                for(int num2 = i-2 ;num2 >= 1;num2--)
                {
                    System.out.print(num2) ;
                }
                if(lststar < i)
                {
                    System.out.print("*");
                }
                
                 System.out.println();
            }
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print("*");
            
             
            
             for(int num1 = 1;num1 <= n - i  ;num1++)
                {
                    System.out.print(num1) ;
                }
            
            for(int num2 = n-i-1 ;num2 >= 1 ;num2--)
                {
                    System.out.print(num2) ;
                }
                     
                if(lststar2 <= n - i)
                {
                    System.out.print("*");
                }
                
                 System.out.println();
                   
        }        
                   
	}
        
}


