package org.test.ds.arrayTest;

import java.util.Arrays;

public class MinDifferenceOfTwoArrays {
	
	public static int getMinDifference(int[] arr1, int[] arr2){
		if(arr1.length==0 || arr2.length==0) return -1;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int min =Integer.MAX_VALUE;
		int a=0;
		int b=0;
		while(a<arr1.length || b<arr2.length){
			if(Math.abs(arr1[a]-arr2[b])<min){
				min =Math.abs(arr1[a]- arr2[b]);
				
			}
			a++;
			b++;
		}
		return min;
		
	}
	public static void main(String[] args) {
		int[] arr1 ={2,10,4,11};
		int[] arr2 ={11,10,6,15};
		System.out.println(getMinDifference(arr1, arr2));
		
		
	}

}
