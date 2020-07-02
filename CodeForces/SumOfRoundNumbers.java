package CodeForces;

import java.util.* ;

public class SumOfRoundNumbers {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		while(tc-- > 0)
		{
			
			int n = s.nextInt();
			
			int zeroCount = 0;	
			int count = 0;
			int temp = n;
			while(temp > 0) {
				if(temp%10 == 0) {
					zeroCount++ ;
				}
				temp = temp/10;
				count++ ;
			}
	
			int i = 0;
			
			int k = count - zeroCount;
			
			System.out.println(k);
			
			int powCount = 0;
			while(n > 0)
			{
				if(n%10 == 0) {
					powCount++;
					n = n/10;
					continue;
				}
				int elem = (int)((n%10) * Math.pow(10, powCount));
				System.out.print(elem + " ");
				powCount++;
				n = n/10;
			}
			System.out.println();
		}
	}
	
}
