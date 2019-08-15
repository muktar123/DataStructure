package org.test.dp;

public class TotalWaysOfCoinChange {
		public static int dynamic(int[] v, int amount) {
			int[][] solution = new int[v.length + 1][amount + 1];

			for (int i = 0; i <= v.length; i++) {
				solution[i][0] = 1;
			}

			for (int i = 1; i <= amount; i++) {
				solution[0][i] = 0;
			}

			for (int i = 1; i <= v.length; i++) {
				for (int j = 1; j <= amount; j++) {
					if (v[i - 1] <= j) {
						// reduce the amount by coin value and
						// use the subproblem solution (amount-v[i]) and
						// add the solution from the top to it
						solution[i][j] = solution[i - 1][j]
								+ solution[i][j - v[i - 1]];
					} else {
						// just copy the value from the top
						solution[i][j] = solution[i - 1][j];
					}
				}
			}
			return solution[v.length][amount];
		}

		public static void main(String[] args) {
			int amount = 4;
			int[] v = { 1, 2, 3 };
			System.out.println("Total possible ways: " + dynamic(v, amount));
		}

	
}
