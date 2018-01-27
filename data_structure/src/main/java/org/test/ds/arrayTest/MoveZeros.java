package org.test.ds.arrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
		/*
		 * List set = new ArrayList(); int[] num2 = new int[nums.length];
		 * for(int i=0;i<nums.length;i++){ if(nums[i]!=0){ num2[i]=nums[i]; } }
		 * for(int j=set.size();j<nums.length;j++) set.add(0); // Integer nums[]
		 * = new Integer[arrlist.size()]; // nums=(int[]) set.toArray(nums);
		 * System.out.println(set);
		 * 
		 * } public static void main(String[] args) { MoveZeros mz = new
		 * MoveZeros(); int[] nums = {1,0,3,0,2,5}; mz.moveZeroes(nums);
		 */
		
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[cnt] = nums[i];
				cnt++;
			}
		}
		for (int j = cnt; j < nums.length; j++)
			nums[j] = 0;

		 System.out.println(Arrays.toString(nums));
	}
	
	public int removeElementImproved(int[] nums, int val) {
	    int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;
	        } else {
	            i++;
	        }
	    }
	    System.out.println(Arrays.toString(nums));
	    return n;
	}
	public static void main(String[] args) { MoveZeros mz = new  MoveZeros();
	int[] nums = {1,2,3,5,4,3};
//	mz.moveZeroes(nums);
	System.out.println(mz.removeElementImproved(nums, 4));
	}

}
