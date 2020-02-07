package arraysAndStrings;

public class CompressedString {

	public static String compressedString(String input) {
		
		
		String ans = ""  ;
		
		for(int i=0; i<input.length(); i++) {
			int count = 1;
			while( i<input.length()-1 && input.charAt(i) == input.charAt(i+1)) {
				count++ ;
				i++ ;
			}
			
			if(count!= 1) {
				ans = ans +input.charAt(i)+ count ;
			}
			else {
				ans = ans + input.charAt(i) ;
			}
		}
		return ans ;
	}
	
	public static void main(String[] args) {
	
		String input = "aaabbcdda" ;
		System.out.print(compressedString(input));
	}

}
