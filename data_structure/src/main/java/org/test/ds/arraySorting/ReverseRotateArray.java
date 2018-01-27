package org.test.ds.arraySorting;

import java.util.Arrays;

public class ReverseRotateArray {

	public static void rotateArray(int[] rotateArray, int k) {
		int n = rotateArray.length;
		swap(rotateArray, 0, k - 1);
		swap(rotateArray, k, n - 1);
		swap(rotateArray, 0, n - 1);

	}

	public static void swap(int aa[], int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = aa[start];
			aa[start] = aa[end];
			aa[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] rotateArr = { 1,2,3,4,5};
		rotateArray(rotateArr, 4);
		printArray(rotateArr);
		// System.out.println(syArrays.toString(rotateArr));
	}

}
