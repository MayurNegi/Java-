package Recursion;

public class Allindexes {

	private static int[] allIndexes(int[] arr,int index ,int x) {
		
	
	if(index == arr.length) {
		int[] ans = new int[0] ;
		return ans ;
	}
		
	int[] smallAns = allIndexes(arr, index+1 , x);
	
	if(arr[index] == x) {
		int[] ans = new int[smallAns.length + 1] ;
		ans[0] = index ;
		
		for(int i=1; i<ans.length; i++) {
			ans[i] = smallAns[i-1] ;			
		}
		return ans ;
	}
	else {
		return smallAns ;
	}

	}
	
	
	public static void main(String[] args) {
		
		int[] arr = { 9, 8,10,8,8 ,5,8,7} ;
		int x = 8 ;  // element to be searched
		
		int[] ans = allIndexes(arr, 0 , x) ; 
		for(int i=0; i<ans.length; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}

}
