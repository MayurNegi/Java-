package Recursion;

import java.util.* ;

public class Dump {

private static int orderChangeIndex(int arr[]){
        
        for(int i=arr.length - 1; i > 0; i--)
        {
            if(arr[i] > arr[i-1]){
                return i-1;
            }
        }
        return 0;  
    }
    
    private static void print(int arr[]){
        
        for(int i=0; i<arr.length; i++)
        {
        	System.out.print(arr[i]) ;
        }
         
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in) ;
	        int n = s.nextInt() ;
	        int count = 0;
	        int tempNum = n;
	        while(tempNum>0)
	        {
	            tempNum /= 10;
	            count++ ;
	        }
	        
	        int arr[] = new int[count] ;
	        for(int i=0; i<count; i++)
	        {
	            arr[i] = n%10 ;
	            n = n/10;
	        }
	        
	        int index = orderChangeIndex(arr) ;
	        
	        if(index == 0){
	        Arrays.sort(arr);
	        print(arr) ;
		}
	        
//	        else {
//	        int min = 100 ;
//	        int minIndex = count - 1;
//	        for(int i = index; i<count; i++)
//	        {
//	            if(arr[i] <= arr[index]){
//	                continue ;
//	            }
//	        
//	            if(arr[i] < min){
//	                min = arr[i] ;
//	                minIndex = i ;
//	            }
//	        }
//	        
//	        int temp = arr[index] ;
//	        arr[index] = arr[minIndex] ;
//	        arr[minIndex] = temp ;           // swapping of next largest no. after arr[index].
//	        
//	        int start = index + 1;
//	        int end = count - 1;
//	        while(start <= end)
//	        {
//	            int temp1 = arr[start] ;
//	            arr[start] = arr[end] ;
//	            arr[end] = temp1 ;
//
//	        start++ ;
//	        end-- ;
//	        }
//	        
//	        print(arr) ;
//	        
//	        }
	}

}
