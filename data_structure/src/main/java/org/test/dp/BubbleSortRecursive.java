package org.test.dp;

import java.util.Arrays;

public class BubbleSortRecursive {

	public static void bSort(int[] arr, int size){
		for(int i=size-1;i>=0;i--){
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1]){
					swap(j,j+1,arr);
				
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void bSortRecursive(int[] arr, int size){
	//	for(int i=size-1;i>=0;i--){
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1]){
					swap(j,j+1,arr);
				
				}
				bSortRecursive(arr, size-1);
			}
			
		}
	//	System.out.println(Arrays.toString(arr));
	

	private static void swap(int i, int j,int[] arr) {
		int temp=0;
				temp=arr[i];;
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void main(String[] args) {
		int[] arr={5,4,7,15,6,9};
	//	bSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
		bSortRecursive(arr,arr.length);
		System.out.println(Arrays.toString(arr));
		
	}
}
