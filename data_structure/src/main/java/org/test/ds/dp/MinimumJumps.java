package org.test.dp;

public class MinimumJumps {
	public static int getMinJumps(int arr[], int l, int h) {
		if(l==h) return 0;
		
		if(arr[l]==0) return Integer.MAX_VALUE;
		int i=0;
		int min  = Integer.MAX_VALUE;
		for (i = l+1; i <=h && i<=l+arr[l]; i++) {
			int jumps = getMinJumps(arr, i, h);
			if(jumps!=Integer.MAX_VALUE && jumps+1<min)
				min= jumps+1;
			
		}
		return min;
		
	}
	 public static void main(String args[]) 
	   { 
	      //  int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};  
	        int arr[] = {1, 3, 6, 3};  

	        int n = arr.length; 
	        System.out.print("Minimum number of jumps to reach end is " 
	                          + getMinJumps(arr, 0, n-1)); 
	   } 

}
