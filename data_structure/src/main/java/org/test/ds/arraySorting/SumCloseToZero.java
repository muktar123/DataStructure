package org.test.ds.arraySorting;

public class SumCloseToZero {
	public static void getSum(int[] arr, int n) {

		int minsum = arr[0] + arr[1];
		int sum = 0;
		int lindex = 0;
		int rIndex =	 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (Math.abs(sum) < Math.abs(minsum)) {
					minsum = sum;
					lindex = i;
					rIndex = j;
				}

			}
		}

		System.out.println(" The two elements whose " + "sum is minimum are "
				+ arr[lindex] + " and " + arr[rIndex]);
	}

	// main function
	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		getSum(arr, 6);
		float c= (float) (10.5%3.4);
		System.out.printf("%f",c);
	}

}
