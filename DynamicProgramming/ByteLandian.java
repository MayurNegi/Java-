package DynamicProgramming;

import java.util.* ;

public class ByteLandian {
	
//public static boolean helper(int n, int[] arr, int k,int i, int[] dp){
//        
//        if(i == n) {
//            return false;
//        }
//        
//        if( i < n && k == 0) {
//            return true;
//        }
//        
//        boolean ans;
//        if(arr[i] <= k){
//            boolean ans1 = helper(n, arr, k-arr[i], i+1, dp);
//            boolean ans2 = helper(n, arr, k, i+1, dp);
//            ans = (ans1 || ans2) ;
//        }else{
//            ans = helper(n, arr, k, i+1, dp);
//        }
//        
//        return ans;
//    }
    
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i< n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        int k = s.nextInt();
		int dp[] = new int[n] ;
        
		boolean ans = true;
//        boolean ans = helper(n , arr, k, 0, dp);
        
		
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}

}
