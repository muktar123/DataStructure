package org.test.ds.arrayTest;

public class ArraySumWithBSearch {

	public static int[] twoSum(int[] numbers, int target) {
		// Assume input is already sorted.
		for (int i = 0; i < numbers.length; i++) {
		int j = bsearch(numbers, target - numbers[i], i + 1);
		if (j != -1) {
		return new int[] { i + 1, j + 1 };
		}
		}
		throw new IllegalArgumentException("No two sum solution");
		}
		private static int bsearch(int[] A, int key, int start) {
		int L = start, R = A.length - 1;
		while (L < R) {
		int M = (L + R) / 2;
		if (A[M] < key) {
		L = M + 1;
		} else {
		R = M;
		}
		}
		return (L == R && A[L] == key) ? L : -1;
		}
		public static void main(String[] args) {
			//int[] arr = { 3, 5, 1, 7, 14,9 };
			int[] arr = { 1,3,5,7,9,14,17};

			int[] arrr =twoSum(arr, 31);
			System.out.println(arrr[0]+" "+arrr[1]);
		//	printPairs(arr, 12);
		}
}
