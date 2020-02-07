package Recursion;

public class CheckSort2 {

//	public static boolean checkSort(int[] arr) {
//		
//		int n = arr.length ;
//		if(n <= 1) {
//			return true ;
//		}
//		if(arr[0] > arr[1]) {
//			return false ;
//		}
//		
//		int[] smallArr = new int[n-1] ;
//		for(int i = 1; i< n; i++) 
//		{
//			smallArr[i-1] = arr[i] ;
//		}
//		
//		boolean smallAns = checkSort(smallArr) ;
//		return smallAns ;
//	}
	
	// method 2
	//in this function start index traverses from start to end
	
	public static boolean checkSort(int[] arr , int startIndex ) {
		
		if(startIndex >= arr.length - 1) {
			return true ;
		}
		
		if(arr[startIndex] > arr[startIndex+1] ) {
			return false ;
		}
		
		boolean smallAns = checkSort(arr , startIndex+1) ;
		return smallAns ;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3 ,5, 89} ;
		System.out.println(checkSort(arr , 0));

	}

}
