package org.test.ds.arrayTest;

import java.util.Arrays;

public class MinDiffOfTwoArrays {
	
	public static int getMinDifference(int[] a, int[] b){
		Arrays.sort(a);
		Arrays.sort(b);
		int len1= a.length;
		int len2=b.length;
		int i=0,j=0;
		int diff=Integer.MAX_VALUE;
		while(i<len1 && j<len2){
			if(Math.abs(a[i]-b[j])<diff){
				//System.out.println(i+" "+j);
				diff=Math.abs(a[i]-b[j]);
			}
			if(a[i]<b[j]){
				i++;
			}else{
				j++;
			}
		}
		return diff;
	}
	public static void main(String[] args) {
		 int[] A = {1, 2, 11, 5};
		 
		    // Input given array B
		    int[] B = {4, 12, 19, 23, 127, 235};
		    System.out.println(getMinDifference(A, B));
	}

}
