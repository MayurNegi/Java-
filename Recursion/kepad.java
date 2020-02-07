package Recursion;

public class kepad {

	public static String[] refrence(int n){
        if(n== 0 || n==1){
            String[] str = {""} ;
            return str ;}
        if(n == 2) {
            String[] str = {"a","b","c"} ;
            return str ;}
        else if(n==3) {
            String[] str = {"d","e","f"} ;
            return str ;}
        else if(n==4) {
            String[] str = { "g","h","i" } ;
            return str ;}
        else if(n==5) {
            String[] str = {"j","k","l"} ;
            return str ;}
        else if(n==6) {
            String[] str = {"m","n","o" } ;
            return str ;}
        else if(n==7) {
            String[] str = {"p","q","r","s"} ;
            return str ;}
        else if(n==8) {
            String[] str = {"t","u","v"} ;
            return str ;}
        else { 
             String[] str = {"w","x","y","z"} ;
             return str;
        }

    }
    
//	public static String[] keypad(int n){
//		
//		if(n==0) {
//			String ans[] = {""} ;
//			return ans ;
//		}
//		
//		String[] smallAns = keypad(n / 10) ;
//		int rest = n%10 ;
//		String[] restArr = refrence(rest) ;
//		String[] ans = new String[smallAns.length * restArr.length] ;
//		
//		int k = 0;
//		for(int i=0; i<smallAns.length; i++)
//		{
//			for(int j=0; j<restArr.length; j++)
//			{
//				ans[k] = smallAns[i] + restArr[j] ;
//				k++ ;
//			}
//		}
//		 return ans ;
//	}
//	
//	public static void main(String[] args) {
//		String[] ans = keypad(239) ;
//		for(int i = 0; i<ans.length; i++)
//		{
//			System.out.println(ans[i]) ;
//		}
//		
//	}
//
//}

	
	  public static void printKeypad(int input,String outputSoFar){
	        
	        if(input == 0){
	            System.out.println(outputSoFar) ;
	            return ;
	        }
	        String ans[] = refrence(input%10) ;
	       
	        printKeypad(input / 10 , refrence(input%10)[0]+ outputSoFar ) ;
	        printKeypad(input / 10 ,refrence(input%10)[1] + outputSoFar ) ;
	        printKeypad(input / 10 ,refrence(input%10)[2] + outputSoFar ) ;
	        if(input%10 == 7 || input%10 == 9){
	             printKeypad(input / 10 ,refrence(input%10)[3] + outputSoFar ) ;
	        }
	     
	        
	    }

		public static void printKeypad(int input){
		
	        printKeypad(input, "" ) ;
		}
		
		public static void main(String[] args) {
			
			int input = 239 ;
			printKeypad(input) ;
		}
		
	}
