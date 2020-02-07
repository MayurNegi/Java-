package SortingAlgorithms;

public class QuickSort {

	public static void quickSort(int[] input, int si, int ei) {
		
		if(si >= ei) {
			return ;
		}
		
		int pivotpos = partition(input, si ,ei) ;
		quickSort(input, si, pivotpos-1) ;
		quickSort(input, pivotpos+1, ei) ;
		return ;
	}
	
	private static int partition(int[] input, int si, int ei) {
		
		int pivot = input[si] ;
		int count = 0;
		for(int i= si + 1 ;i< ei ;i++)
		{
			if(pivot >= input[i]) {
				count++ ;
			}
		}
		
		int pivotpos = si + count ;
		input[si] = input[pivotpos] ;    
		// placing pivot position at its correct place.
		input[pivotpos] = pivot ;
		
		int i = si ;
		int j = ei ;
		
		while( i < pivotpos && j> pivotpos )
		{
			if(input[i] <= pivot) {
				i++ ;
			}
			else if(input[j] > pivot){
				j-- ;
			}
			else {
					int temp2 = input[i] ;
					input[i] = input[j] ;
					input[j] = temp2 ;
					i++ ;
					j-- ;
				}
			}
//		while(i < j)
//		{
//		while(i<= ei && input[i] <= pivot) {
//			i++ ;
//		}
//		while(input[j] > pivot) {
//			j-- ;
//		}
//		if( i<= j) {
//			int temp = input[i] ;
//			input[i] = input[j] ;
//			input[j] = temp ;
//			i++ ;
//			j-- ;
//		}
//		}
			
		return pivotpos ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 18, 19, 9, 6, 2, 12} ;
		quickSort(input , 0, input.length-1) ;
		for(int i=0; i<input.length ; i++) {
			System.out.print(input[i] + " " );
		}
	}

}
