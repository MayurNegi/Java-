package CodeChef;

import java.util.*;

public class chefInFantasyLeague {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int tc = s.nextInt();
		
		while(tc > 0)
		{
			int N = s.nextInt();
			int S = s.nextInt();
			
			int price[] = new int[N];
			for(int i = 0; i < N; i++)
			{
				price[i] = s.nextInt();
			}
			
			int type[] = new int[N]; // 0 for defender 1 for forward
			for(int i = 0; i < N; i++)
			{
				type[i] = s.nextInt();
			}
			
			int minDef = Integer.MAX_VALUE;
			int minFor = Integer.MAX_VALUE;
			
			for(int i = 0; i < N; i++)
			{
				if(type[i] == 0)
				{
					if(price[i] < minDef) {
						minDef = price[i] ;
					}
				}
				else {
					if(price[i] < minFor) {
						minFor = price[i] ;
					}
				}
			}
			
			if( 100 - (S + minDef + minFor) >= 0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			tc-- ;
		}
		
	}

}
