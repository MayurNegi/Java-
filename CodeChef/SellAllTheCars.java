package CodeChef;

import java.util.*;

public class SellAllTheCars {
	
	public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	
	int testCases = s.nextInt();
	
	while(testCases > 0)
	{
		int Cars = s.nextInt();
		int price[] = new int[Cars];
		for(int i=0; i < Cars; i++)
		{
			price[i] = s.nextInt();
		}
		
		Arrays.sort(price);
		int sum = 0;
		int decrement = 0;
		
		
		for(int i= Cars-1 ; i >= 0; i--)
		{
			price[i] = price[i] - decrement;
			if(price[i] <= 0) {
				break;
			}
			
			sum += price[i] ;
			decrement++ ;
		}
		
		System.out.println(sum);
		
		testCases-- ;
		}
	}
}
