package org.test.dp;

public class PartitionProblem {

	public static boolean isSubset(int[] arr, int n, int sum) {

		if (sum == 0)
			return true;
		if (sum != 0 && n == 0)
			return false;

		if (arr[n - 1] > sum)
			return isSubset(arr, n - 1, sum);

		return isSubset(arr, n - 1, sum) || isSubset(arr, n - 1, sum - arr[n - 1]);
	}

	public static boolean findPartition(int[] arr, int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		if (sum % 2 == 0)
			return isSubset(arr, n, sum / 2);
		else
			return false;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 5, 9, 12 };
		int n = arr.length;
		if (findPartition(arr, n) == true)
			System.out.println("Can be divided into two " + "subsets of equal sum");
		else
			System.out.println("Can not be divided into " + "two subsets of equal sum");
	}
}
