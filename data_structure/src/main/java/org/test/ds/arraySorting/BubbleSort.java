package org.test.ds.arraySorting;

import java.util.Arrays;

public class BubbleSort {
	static boolean flag=true;
	public  static void sort(int[] a, int n){
		System.out.println(System.currentTimeMillis());
		for(int j=n;j>=0 && flag;j--){
			flag=false;
			for(int i=0;i<j-1;i++){
				if(a[i]>a[i+1]){
					swap(i,i+1,a);
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

	private static void swap(int i, int j,int[] arr) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		flag=true;
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {2,1,8,4,3,9,5};
		sort(arr,arr.length);
	}

}
