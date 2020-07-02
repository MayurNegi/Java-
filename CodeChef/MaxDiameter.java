package CodeChef;

import java.util.* ;

public class MaxDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int testCases = s.nextInt() ;
		
		while(testCases > 0) {
			int indexes = s.nextInt();
			
			int arr1[] = new int[indexes] ;
			for(int i=0; i<indexes; i++)
			{
				arr1[i] = s.nextInt() ;
			}
			
			int arr2[] = new int[indexes] ;
			for(int i=0; i<indexes; i++)
			{
				arr2[i] = s.nextInt();
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			int temp = 0;
			for(int i=0; i<indexes; i++)
			{
				temp += Math.min(arr1[i], arr2[i]) ;
			}
			System.out.println(temp);
			
			testCases-- ;
		}
	}
}
