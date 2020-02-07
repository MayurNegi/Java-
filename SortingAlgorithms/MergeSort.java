package SortingAlgorithms;

public class MergeSort {

	public static void mergeSort(int[] input,int start,int end) {
		
		if(start < end) {
		int mid = (start + end) / 2 ;
		
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end) ;
		
		merge(input, start, end) ;
		}
	}
	
	private static void merge(int[] input, int start, int end) {
		int mid = (start+end) / 2;
		
		int ans[] = new int[end - start + 1] ;
		int i= start;
		int j = mid+1 ;
		int k = 0;
		while(i <= mid && j<=end )
		{
			if(input[i] < input[j]) {
				ans[k] = input[i] ;
				i++;
				k++;
			}
			else {
				ans[k] = input[j] ;
				j++ ;
				k++ ;
			}
		}
		
		while(i<=mid)
		{
			ans[k] = input[i] ;
			k++;
			i++;
		}
		while(j<=end)
		{
			ans[k] = input[j];
			k++;
			j++;
		}
		
		for(int index =0; index<ans.length; index++)
		{
			input[start+ index] = ans[index] ;
		}
	}
	
	public static void main(String[] args) {
		
		int[] input = {1 ,3 ,6 ,5 ,11,9,2} ;
		mergeSort(input , 0 , input.length-1) ;
		for(int i=0 ; i<input.length ;i++)
		{
			System.out.print(input[i] + " ");
		}
	}
}
