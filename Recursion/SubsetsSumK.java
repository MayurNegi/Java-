package Recursion;

import java.util.* ;

public class SubsetsSumK {

	    public static int[][] helper(int input[], int index) {   
	        
	        if(index == input.length ){
	    	   int[][] ans = new int[1][0] ;
	           return ans;
	       }
	       
	       int smallAns[][] = helper(input , index+1) ;
	       int[][]ans = new int[2 * smallAns.length][] ;
	       
	       int k = 0;
	      
	        for(int i = 0 ; i < smallAns.length  ; i++)
	        {
	           ans[k] = new int[smallAns[i].length ] ;
	          for(int j = 0; j < smallAns[i].length ; j++)
	          {
	              ans[k][j] = smallAns[i][j] ;
	          }
	          k++ ;
	       }
	       
	        for(int i = 0 ; i< smallAns.length ; i++)
	        {
	           ans[k] = new int[smallAns[i].length + 1] ;
	            ans[k][0] = input[index] ;
	           for(int j = 1; j <= smallAns[i].length ; j++)
	           {
	               ans[k][j] = smallAns[i][j-1] ;
	           }
	           k++ ;
	       }
	       
	        return ans ;
	    
	    }
	    
		public static int[][] subsetsSumK(int input[], int k) {
			// Write your code here
	        int arr[][] = helper(input,0);
	        
	        int index = 0;
	        int ans[][] = new int[arr.length][];
	        
	        for(int i=0;i<arr.length;i++){
	            
	            int sum  = 0;
	            
	            for(int j=0;j<arr[i].length;j++){
	                sum += arr[i][j];
	            }
	            
	            if(sum == k){
	                 ans[index] = new int[arr[i].length];
	                
	                for(int j=0;j<arr[i].length;j++)
	                    ans[index][j] = arr[i][j];
	                
	                index ++;
	            }    
	        }
	        
	        return ans;

		}
	
		public static void main(String[] args) {
			
			int[] input = {1 ,2 ,3 , 4, 5} ;
			int output[][] = subsetsSumK(input , 6);
			for(int i = 0; i < output.length; i++) {
				for(int j = 0; j < output[i].length; j++) {
					System.out.print(output[i][j] + " ");
				}
				System.out.println();
			}
		}
		
}
