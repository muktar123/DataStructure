package org.test.ds.arrayTest;

import java.util.Arrays;

public class SumOfNumbersInArrayUsingSort {

	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}
	}

	public static void findSUM(int[] arr, int sum) {

		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] == sum) {
				System.out.println("found sum in " + arr[l] + " and " + arr[r]);
				break;
			} else if (arr[l] + arr[r] > sum) {
				r--;
			} else {
				l++;
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 3, 5, 1, 7, 14,9 };

		findSUM(arr, 12);
		printPairs(arr, 12);
		// System.out.println(arrr[0]+" "+arrr[1]);

	}
}
