package org.test.ds.arrayTest;

import java.util.Hashtable;

public class TwoSumWithTwoArrays {
	
	public static void twoSum(int[] arr, int[] arr1, int target){
		
		//int count =0
		if(arr.length<2) return;
		
		Hashtable set = new Hashtable();
		for(int i=0;i<arr.length;i++)
			set.put(arr[i], i);
		
		for(int j=0;j<arr1.length;j++ ){
			int num = target-arr1[j];
			if(set.containsKey(num)){
				System.out.printf("(%d, %d) %n", num, arr1[j]);
			}
		}
		
	}
	public static void main(String[] args) {
		 int arr[] ={1,2,5,6,9};
		 int arr1[] ={4,1,8,2,3};
		 twoSum(arr1, arr, 8);
	}

}

