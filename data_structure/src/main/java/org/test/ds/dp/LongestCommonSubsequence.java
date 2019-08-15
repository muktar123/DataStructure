package org.test.dp;

public class LongestCommonSubsequence {
	public static int getLongestCommonSubsequence(String str1, String str2, int m, int n) {

		if (m == 0 || n == 0)
			return 0;
		if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
			return 1 + getLongestCommonSubsequence(str1, str2, m - 1, n - 1);
		} else {
			return Math.max(getLongestCommonSubsequence(str1, str2, m - 1, n),
					getLongestCommonSubsequence(str1, str2, m, n - 1));
		}

	}

	public static int getLongestCommonSubsequenceUsingDP(char[] X, char[] Y, int m, int n) {

		int L[][] = new int[m + 1][n + 1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X[i - 1] == Y[j - 1]) {
					L[i][j] =1 + getLongestCommonSubsequenceUsingDP(X, Y, m - 1, n - 1);
				} else {
					L[i][j]=Math.max(L[i - 1][j], L[i][j - 1]);
				}
			}
		}
		return L[m-1][n-1];

	}

	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		int m = s1.length();
		int n = s2.length();

		System.out.println("Length of LCS is" + " " + getLongestCommonSubsequence(s1, s2, m, n));
		char[] X= s1.toCharArray();
		char[] Y= s2.toCharArray();
		System.out.println("Length of LCS is" + " " +getLongestCommonSubsequenceUsingDP(X,Y,m,n));
	}

}
