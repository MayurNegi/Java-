package fundamentals;

public class functions {
	
	public static int sum(int a ,int b)
	{
		int ans = a + b ;
		return ans ;
	}
	
	public static void printEvenNumbers()
	{
		for(int i = 2 ; i <= 100 ; i += 2)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args)
	{
		
		printEvenNumbers() ;
		
//		int num1 = 10 ;
//		int num2 = 16 ;
//		int ans = sum(num1 ,num2) ;
//		System.out.println(ans);
	}

}
