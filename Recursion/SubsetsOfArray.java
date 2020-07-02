package Recursion;

public class SubsetsOfArray {

	public static int[][] subsets(int input[] , int index ){
        
       
       if(index == input.length ){
    	   int[][] ans = new int[1][0] ;
           return ans;
       }
       
       int smallAns[][] = subsets(input , index+1) ;
       int[][]ans = new int[2 * smallAns.length][] ;
       
       int k = 0;
      
       for(int i =0 ; i < smallAns.length  ; i++)
       {
          for(int j = 0; j < smallAns[i].length ; j++)
          {
              ans[k][j] = smallAns[i][j] ;
          }
          k++ ;
       }
       
       for(int i = 0 ; i< smallAns.length ; i++)
       {
            ans[k][0] = input[index] ;
           for(int j = 1; j <= smallAns[i].length ; j++)
           {
               ans[k][j] = smallAns[i][j-1] ;
           }
           k++ ;
       }
       
       return ans ;
   }
	

	
	public static void main(String[] args) {
		
		int input[] = {1,2,3} ;
		int ans[][] = subsets(input, 0) ;
		   for(int i = 0 ; i< ans.length; i++)
	       {
	           for(int j = 0; j < ans[i].length ; j++)
	           {
	               System.out.println(ans[i][j]) ;
	           }
	       }
	}
}
