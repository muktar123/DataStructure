package org.test.ds.arrayTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfNumbersInArray {
	public static void twoSum(int[] numbers, int n) {

		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value; // if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3,2,4, 5,1, 7, 14 };

		twoSum(arr, 6);
		// System.out.println(arrr[0]+" "+arrr[1]);
	}

}
