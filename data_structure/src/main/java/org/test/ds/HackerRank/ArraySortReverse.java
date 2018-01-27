package org.test.ds.HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArraySortReverse {

	    public static void main(String[] args) {
	       
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	         int tmp[] = new int[arr.length];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	             
	                Collections.sort(arr,Comparator.reverseOrder());
	        
	               for(int  i : arr){
	        
	                   System.out.print(arr[i]);
	        
	                }
	        
	            }

}
