package org.test.ds.arraySorting;

import java.util.Arrays;

public class ReverseArray {
	
	public void reverseArrRecursive(int[] arr, int first,int end){
		if(first<end){
			int temp =arr[first];
			arr[first]=  arr[end];
			arr[end] = temp;
			first++;
			end--;
			reverseArrRecursive(arr,first,end);
			
		}
	}
	public void reverseArrIterative(int[] arr, int first,int end){
		while(first<end){
			int temp =arr[first];
			arr[first]=  arr[end];
			arr[end] = temp;
			first++;
			end--;
			
			
		}
	}
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int[] arr={1,2,3,4,5};
		ra.reverseArrRecursive(arr,0,arr.length-1);
	//	ra.reverseArrIterative(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	//	System.out.println(Arrays.toString(arr));
	}

}
