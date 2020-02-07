package arraysAndStrings;

public class RemoveCharacter {

	public static String removeCharacter(String input , char ch) {
		
		String ans = "" ;
		for(int i=0 ; i<input.length(); i++) {
			
			if(input.charAt(i) != ch) {
				ans = ans + input.charAt(i) ;
			}
			
		}
		return ans ;
	}
	
	public static void main(String[] args) {
		
	 String str = "Welcome to the world" ;
	 System.out.println(removeCharacter(str , 't'));
	}

}
