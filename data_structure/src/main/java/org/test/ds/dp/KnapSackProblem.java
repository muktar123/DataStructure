package org.test.dp;

public class KnapSackProblem {

	public static int knapsack(int val[], int[] Wt, int n, int W) {

		if (n == 0 || W == 0)
			return 0;

		if (Wt[n - 1] > W)
			return knapsack(val, Wt, n - 1, W);

		return Math.max(val[n - 1] + knapsack(val, Wt, n - 1, W- Wt[n - 1]), knapsack(val, Wt, n - 1, W));
	}
	
	public static int knapsackUsingDP(int val[], int[] Wt, int n, int W) {
		int K[][] = new int[n+1][W+1];
		int i,w;
		for (i = 0; i <=n; i++) {
			for (w = 0; w<= W; w++) {
				if(i==0 || w==0)
					 K[i][w]=0;
				else if(Wt[i-1]<=w)
					K[i][w]= Math.max(val[i-1]+ K[i-1][w-Wt[i-1]], K[i-1][w]);
				else 
					 K[i][w] = K[i-1][w];

				
			}
			
		}
		
		return K[n][W];
	}

	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		System.out.println(knapsack(val, wt, n, W));
		System.out.println(knapsackUsingDP(val, wt, n, W));

	}
}
