package Recursion;

public class ReturnAllCodes {
	
	public static char refrence(String smallStr) {
		
		int num = 0;
		if(smallStr.length() == 1) {
			num = (int)(smallStr.charAt(0) - '0') ;
		}
		else if(smallStr.length() == 2 ) {
			num = (int)(smallStr.charAt(0) + smallStr.charAt(1) - '0' - '0') ;
		}
		
		char result = (char)('a' + num - 1) ;
		return result ;
	}
	
	
		public static  String[] getCode(String input){
			// Write your code here
			if(input.length() == 0) {
				String[] output = {""} ;
				return output ;
			}
			
			String[] smallOutput1 = getCode(input.substring(1)) ;
			String[] smallOutput2 = getCode(input.substring(2)) ;
			char rest1 = refrence(input.substring(0,1)) ;
			char rest2 = refrence(input.substring(0,2)) ;
			
			String[] output = new String[smallOutput1.length + smallOutput2.length] ;
			
			int row = 0;
			for(int i=0; i<smallOutput1.length; i++)
			{
				output[row] = rest1 + smallOutput1[i] ;
				row++ ;
			}
			
			for(int i=0; i<smallOutput2.length; i++)
			{
				output[row] = rest2 + smallOutput2[i] ;
				row++ ;
			}
			
			return output ;
		}

		public static void main(String[] args) {
			
			String input = "1123" ;
			String[] output = getCode(input) ;
			for(int i=0; i < output.length; i++)
			{
				System.out.println(output[i]);
			}
		}
		
		
}

