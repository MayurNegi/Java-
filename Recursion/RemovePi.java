package Recursion;

public class RemovePi {

	public static String removePi(String str) {
	
		if(str.length() <= 1) {
			return str ;
		}
		String ans = "" ;
		String smallAns = removePi(str.substring(1)) ;
		
		if(str.charAt(0) == 'p' && smallAns.charAt(0) == 'i') {
			ans = 3.14 +smallAns.substring(1) ;
			
		}
		
		else {
			ans = str.charAt(0) + smallAns ;
		}
		return ans ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "pixpix" ;
		System.out.println(removePi(str));
	}

}
