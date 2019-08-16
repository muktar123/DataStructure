package org.test.dp;

public class MinCoinChange {

	public static int getMinCoinsCount(int S[], int n, int V) {
		if (V == 0)
			return 0;

		int res = Integer.MAX_VALUE;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (S[i] <= V)
				temp =getMinCoinsCount(S, n, V - S[i]);
			if (temp + 1 < res)
				res = temp + 1;
		}
		return res;

	}

	public static int getMinCoinsCount1(int S[], int n, int V) {
		if (V == 0)
			return 1;

		if (V < 0)
			return 0;

		if (n <= 0 && V >=1)
			return 0;

		if (S[n - 1] > V)
			return getMinCoinsCount1(S, n - 1, V);

		return Math.min(getMinCoinsCount1(S, n - 1, V), 1+getMinCoinsCount1(S, n, V - S[n - 1]));

	}

	public static int getPossibleCoinsCount(int S[], int n, int V) {
		if (V == 0)
			return 1;

		if (V < 0)
			return 0;

		if (n <= 0 && V >=1)
			return 0;
		
		  if(S[n-1]>V) return getMinCoinsCount(S, n-1, V);
		 

		return getPossibleCoinsCount(S, n - 1, V) + getPossibleCoinsCount(S, n, V - S[n - 1]);

	}


	public static void main(String[] args) {
		int coins[] =  {1,2,3}; 
	       int n = coins.length; 
	       int V = 4; 
		System.out.println(getMinCoinsCount(coins, n, V));
		System.out.println(getMinCoinsCount1(coins, n, V));

		System.out.println(getPossibleCoinsCount(coins, n, V));
	}

}
