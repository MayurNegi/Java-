package Recursion;

public class StringPalindrome {
	
	 private static boolean isStringPalindrome(String input, int start, int end){
	        
	        if( start >= end){
	            return true ;
	        }
	        
	        if(input.charAt(start) == input.charAt(end)) {
	            return true ;
	        }
	            
	        boolean ans = isStringPalindrome(input , start+1 , end-1) ;
	        return ans ;
	        
	    }

		public static boolean isStringPalindrome(String input) {
			// Write your code here
	        boolean ans = isStringPalindrome(input, 0, input.length() - 1) ;
	        return ans ;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
