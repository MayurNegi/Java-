package Recursion;

public class RemoveConsecutiveDuplicates {

	public static String removeDuplicates(String str ) {
		
		String ans = "" ;
		if(str.length() <= 1) {
			return "" + str.charAt(0);
		}
		
		if(str.charAt(0) != str.charAt(1)) {
			ans = str.charAt(0) + ans ;
		}
		
		String smallAns = removeDuplicates(str.substring(1)) ;
		return ans + smallAns ;
		
	}
	
	public static void main(String[] args) {
		
		String str = "aabbcddaaasdsaqq" ;
		String ans = removeDuplicates(str) ;
		System.out.println(ans);
	}

}
