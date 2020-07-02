package DynamicProgramming;

public class Knapsack {

	public static int knapsack(int W, int[] val, int[] wt) {
		
		int n = val.length;
		int dp[][] = new int [wt.length + 1][W + 1];
		
		int ans;
		for(int i=n-1; i >= 0; i-- )
		{
			for(int w=0; w <= W; w++)
			{
				if(wt[i] <= w) {		
					int ans1 = val[i] + dp[i+1][w - wt[i]];
					int ans2  = dp[i+1][w];
					ans = Math.max(ans1, ans2);
				}else {
					ans = dp[i+1][w];
				}
				dp[i][w] = ans;
			}
		}
		
		return dp[0][W]; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = {20, 25, 30} ;
		int[] val = {200, 300, 100} ;
		int W = 50;
		
		int ans = knapsack(W, val, w);
		System.out.println(ans);
	}

}
