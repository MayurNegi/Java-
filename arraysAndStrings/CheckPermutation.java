package arraysAndStrings;

public class CheckPermutation {

	public static boolean checkPermutation(String input1 , String input2) {
		
		if(input1.length() != input2.length()) {
			return false ;
		}
		int[] freq = new int[256] ;
		
		for(int i =0; i<input1.length(); i++) {
			freq[input1.charAt(i)] ++ ;
		}
		for(int i =0; i<input1.length(); i++) {
			freq[input2.charAt(i)] -- ;
		}
		
		for(int i =0; i<256 ; i++) {
			if(freq[i] != 0) 
			return false;
		}
		
		return true ;
 	}
	
	
	
	public static void main(String[] args) {
		
		String input1 = "abcde" ;
		String input2 = "bceda" ;
		boolean ans = checkPermutation(input1 , input2) ;
		System.out.println(ans);
	}

}
