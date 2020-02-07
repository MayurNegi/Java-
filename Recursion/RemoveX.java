package Recursion;

public class RemoveX {

	public static String removeX(String input) {
		
		if(input.length()== 0) {
			return input ;
		}
		
		String ans = "" ;
		if(input.charAt(0) != 'x') {
			ans = ans + input.charAt(0) ;
		}
		
		String smallAns = removeX(input.substring(1, input.length() )) ;
		return ans + smallAns ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "xabvxaxxa" ;
		System.out.println(removeX(input));
	}

}
