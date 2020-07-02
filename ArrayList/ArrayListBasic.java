package ArrayList;

import java.util.ArrayList ;

public class ArrayListBasic {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>() ;
		arr.add(10) ; 
		arr.add(20); 
		arr.add(30) ;
		arr.add(1,80) ;
		arr.set(0 ,  100) ;
//		System.out.println(arr.size());
//		System.out.println(arr.get(1));
	
		// Enhanced for loop - for each loop
//		System.out.println(arr.get(4)) ;
		for(int i=0; i < arr.size(); i++)  // here i holds values of arrayList
		{
			System.out.println(i);
		}
		
	}
	
}
