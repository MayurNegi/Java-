package Recursion;

public class PairStar {
	
	public static String pairStar(String input) {
		
		if(input.length() == 1) {
			return input ;
		}
		String ans = "" ;
		
		String smallAns = pairStar(input.substring(1)) ;
		if(input.charAt(0) == smallAns.charAt(0)) {
			ans = input.charAt(0) + "*" + smallAns ;
			return ans ;
		}
		else {
			return input.charAt(0) + smallAns ;
		}
	}
	
	public static void main(String[] args) {
		
		String input = "abbccddd" ;
		System.out.print(pairStar(input));
	}
}
