package CodeForces;

import java.util.* ;

public class SameParitySummands {

	public static boolean isEven(int x) {
		if(x%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void helper(int n, int k) {
		
		if(k > n) {
			System.out.println("NO");
			return ;
		}
		
		if(isEven(n) && isEven(k)) {
			System.out.println("YES");
			for(int i = 0; i < k-1; i++)
			{
				System.out.print(1+ " ");
			}
			System.out.print(n - k + 1);
			System.out.println();
		}
		
		if(isEven(n) && !isEven(k)) {
			if(n/k < 2) {
				System.out.println("NO");
				return;
			}
			System.out.println("YES");
			for(int i = 0; i < k-1; i++)
			{
				System.out.print(2+ " ");
			}
			System.out.print(n - 2*(k-1));
			System.out.println();
		}
		
		if(!isEven(n) && isEven(k)) {
			System.out.println("NO");
			return;
		}
		
		if(!isEven(n) && !isEven(k)) {
			System.out.println("YES");
			for(int i = 0; i < k-1; i++)
			{
				System.out.print(1+ " ");
			}
			System.out.print(n - k + 1);
			System.out.println();
		}
		
		return;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		while(tc-- > 0)
		{
			int n = s.nextInt();
			int k = s.nextInt();
			
			helper(n,k);
			
		}
		
	}

}
