package org.test.dp;

public class EditDistance {

	public static int editDistance(String X, String Y, int m, int n) {

		if (m == 0)
			return n;
		if (n == 0)
			return m;

		if (X.charAt(m - 1) == Y.charAt(n - 1))
			return editDistance(X, Y, m - 1, n - 1);

		return 1 + min(editDistance(X, Y, m, n - 1),
				       editDistance(X, Y, m - 1, n),
				       editDistance(X, Y, m - 1, n - 1));

	}
	

	public static int editDistanceUsingDP(String X, String Y, int m, int n) {

		int ed[][] = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if(i==0)
					ed[i][j] = j;
				else if(j==0)
					ed[i][j] = i;
				
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					ed[i][j] = ed[i-1][j-1];
				else {
					ed[i][j] = 1+ min(ed[i][j-1], ed[i-1][j], ed[i-1][j-1]);
				}
					
			}	
			}
		return ed[m][n];	
		


	}
	private static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		else if (y <= x && y <= z)
			return y;
		else
			return z;
	}
	
	 public static void main(String args[]) 
	    { 
	        String str1 = "sunday"; 
	        String str2 = "saturday"; 
	   
	        System.out.println( editDistance( str1 , str2 , str1.length(), str2.length()) ); 
	        System.out.println(editDistanceUsingDP(str1 , str2 , str1.length(), str2.length()));
	    } 

}
