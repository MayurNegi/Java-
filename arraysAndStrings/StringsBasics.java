package arraysAndStrings;

public class StringsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Coding" ;
		String str2 = "is fun" ;
		String str3 = "Ceding" ;
		
		System.out.println(str1.length()) ;
		 System.out.println(str1.equals(str3));
		 System.out.println(str1.compareTo(str3)); // compares their ASCII value i.e. lexicographically
		 System.out.println(str1.contains("ing")) ;
		 System.out.println(str1.substring(1,5)) ; // excluding last index in string, i.e 5 index not printed here.
	
	}

}
