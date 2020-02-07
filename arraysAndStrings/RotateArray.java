package arraysAndStrings;

import java.util.Scanner ;

public class RotateArray {

	public static void main() {
		
		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt();
		int[] arr = new int[n] ;
		int d = s.nextInt();
		
        int[] temparr = new int[d] ;
            
        for(int i = 0; i<d ;i++ )
        {
            temparr[i] = arr[i] ;    
        }
      
        for(int i=0; i<arr.length-d ; i++)
        {
            arr[i] = arr[d+i] ;
            System.out.println(arr[i]);
        }
        
           for(int i=0  ; i<d ; i++)
           {
               arr[arr.length-d+i] = temparr[i] ;
               System.out.print(arr[arr.length-d+i]);
              
           }
           
	}
}
