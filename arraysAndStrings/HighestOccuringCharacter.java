package arraysAndStrings;

public class HighestOccuringCharacter {
	
	public static char highestOccuringCharacter(String str) {
		
		int[] freq = new int[256];
		char ans = str.charAt(0) ;
		int startFreq = (ans) ;
		
		for(int i = 0; i<str.length(); i++) {
			int index= str.charAt(i) ;
			freq[index] ++ ;
		}
		for(int i = 0; i<256; i++) {
			if(freq[i] > freq[startFreq]) {
				ans = (char)(i) ;
			}
		}
		return ans ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbcabb" ;
		System.out.println(highestOccuringCharacter(str));
	}

}
