package org.test.ds.arraySorting;

public class SegregatePositiveAndNegative {

	public void segregateNumbersPositiveAndNegative(int arr[], int size) {

		/* Initialize left and right indexes */
		int left = 0, right = size - 1;

		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (arr[left] < 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] > 0 && left < right)
				right--;

			/*
			 * If left is smaller than right then there is a 1 at left and a 0
			 * at right. Exchange arr[left] and arr[right]
			 */
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

	}

	/* Driver Program to test above functions */
	public static void main(String[] args) {
		SegregatePositiveAndNegative seg = new SegregatePositiveAndNegative();
		int arr[] = new int[] { 10, -11, 20, -21, -14, 15 };
		int i, arr_size = arr.length;

		seg.segregateNumbersPositiveAndNegative(arr, arr_size);

		System.out.print("Array after segregation is ");
		for (i = 0; i < 6; i++)
			System.out.print(arr[i] + " ");
	}
}
