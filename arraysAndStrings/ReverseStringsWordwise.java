package arraysAndStrings;

public class ReverseStringsWordwise {
	
	public static String reverseStringWordwise(String str) {
		
		int startIndex = 0;
		int endIndex = 0 ;
		String ans = " " ;
		int i = 0;
		
		for( ; i<str.length(); i++ ) {
			
			if(str.charAt(i) == ' ' ) {
				endIndex = i - 1;
				String temp = "" ;
				
				for(int j = startIndex; j<= endIndex ; j++) {
					temp = temp + str.charAt(j) ;	
				}
				
				ans = temp + ans ;
				ans = " " + ans ;
				startIndex = i+1 ;
			}			
		}
		// for last word 
		
			String temp = "" ;
			
			for(int j = startIndex; j< str.length() ; j++) {
				temp = temp + str.charAt(j) ;	
			}
			
			ans = temp + ans ;
			ans =  " " + ans ;
	
			return ans ;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to coding world" ;
		System.out.println(reverseStringWordwise(str) );
	}

}
