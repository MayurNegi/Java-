package DynamicProgramming;

public class MinCostPath {
	
	public static int minCostR(int[][] cost, int i, int j, int[][] dp) {
		
		int m = cost.length ;
		int n = cost[0].length;
		
		if(i == m-1 && j == n-1) {
			return cost[i][j];
		}
		
		if(i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		int ans1, ans2, ans3;
		
		if(dp[i+1][j] == Integer.MIN_VALUE) {
			ans1 = minCostR(cost, i+1, j ,dp);
			dp[i+1][j] = ans1 ;
		}else {
			ans1 = dp[i+1][j];
		}
		
		if(dp[i][j+1] == Integer.MIN_VALUE) {
			ans2 = minCostR(cost, i, j+1 ,dp);
			dp[i][j+1] = ans2 ;
		}else {
			ans2 = dp[i][j+1];
		}
		
		if(dp[i+1][j+1] == Integer.MIN_VALUE) {
			ans3 = minCostR(cost, i+1, j+1 ,dp);
			dp[i+1][j+1] = ans3 ;
		}else {
			ans3 = dp[i+1][j+1];
		}
		
		return cost[i][j] + Math.min(ans1 , Math.min(ans2, ans3));
	}
	
	public static int minCostI(int[][] cost) {
		
		int m = cost.length;
		int n = cost[0].length;
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0; i<dp.length; i++)
		{
			for(int j=0; j<dp[0].length; j++)
			{
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i= m-1 ; i>= 0; i--)
		{
			for(int j= n-1; j>= 0; j--)
			{
				if(i == m-1 && j == n-1) {
					dp[i][j] = cost[i][j];
					continue;
				}
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j];
				int ans3 = dp[i+1][j+1];
				dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}
	
	public static int minCostTD(int[][] cost) {
		
		int m = cost.length;
		int n = cost[0].length;
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0; i<dp.length; i++)
		{
			for(int j=0; j<dp[0].length; j++)
			{
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i= 1 ; i <= m; i++)
		{
			for(int j= 1; j<= n; j++)
			{
				if(i == 1 && j == 1) {
					dp[i][j] = cost[0][0];
					continue;
				}
				int ans1 = dp[i-1][j];
				int ans2 = dp[i][j-1];
				int ans3 = dp[i-1][j-1];
				dp[i][j] = cost[i-1][j-1] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		
		int[][] cost = {{1,5,11}, {8,13,12}, {2,3,7}, {15,16,18} };
		int[][] dp = new int[cost.length + 1][cost[0].length + 1];
		for(int i=0; i<= cost.length; i++)
		{
			for(int j=0; j <= cost[0].length; j++)
			{
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		
//		int ans = minCostR(cost, 0, 0, dp);
//		int ans = minCostI(cost);
		int ans = minCostTD(cost);
		
		System.out.println(ans);
	}

}
