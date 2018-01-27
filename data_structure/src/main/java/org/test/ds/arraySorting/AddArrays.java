package org.test.ds.arraySorting;

import java.util.Scanner;

public class AddArrays {
	
	public static void main(String[] args) {
		 Scanner ss = new Scanner(System.in);
			 int n = ss.nextInt();
			
			int[] arr1 = new int[n];//{1,2,3,4};
			int[] arr2 = new int[n];
			int[] arr3 = new int[n];
			 Scanner s = new Scanner(System.in);
	        for (int i = 0; i < arr1.length; i++) {
	  		  arr1[i] = s.nextInt();
			}

			 for (int i = 0; i < arr2.length; i++) {
	  		  arr2[i] = s.nextInt();
			}
				for(int i=0;i<arr1.length;i++){
				arr3[i] = arr2[i] + arr1[i];
			}
			for(int i=0;i<arr2.length;i++)
				System.out.print(arr3[i]+" ");
				

}
}