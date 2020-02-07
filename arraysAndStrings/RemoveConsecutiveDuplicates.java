package arraysAndStrings;

public class RemoveConsecutiveDuplicates {

	public static String removeConscDuplicates(String input) {
		
		int i = 1 ;
		char lastchar = input.charAt(0) ;
		String ans = "" +  input.charAt(0);
		
		while(i < input.length() )
		{
			if(input.charAt(i) != lastchar ) {
				ans += input.charAt(i) ;
				lastchar = input.charAt(i) ;
				
			}
			i++ ;
		}
		return ans ;
	}
	
	public static void main(String[] args) {
		String s = "aaabbcccddaa" ;
		System.out.println(removeConscDuplicates(s));
					
	}

}
