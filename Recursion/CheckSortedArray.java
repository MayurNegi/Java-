package Recursion;

public class CheckSortedArray {

	public static boolean checkSort(int[] arr) {
		
		int n = arr.length ;
		if(n== 1) {
			return true ;
		}
		int[] smallArr = new int[n-1] ;
		for(int i=1; i<n ; i++)
		{
			smallArr[i-1] = arr[i] ;
		}
		
		boolean smallAns = checkSort(smallArr) ;
		if(!smallAns) {
			return false ;
		}
		else if(arr[0] <= arr[1]) {
			return true;
		}
		else {
			return false ;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = { 3 ,2 ,3 , 5, 7} ;
		System.out.print(checkSort(arr)) ;
	}
}
