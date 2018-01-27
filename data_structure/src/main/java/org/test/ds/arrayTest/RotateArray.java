package org.test.ds.arrayTest;

import java.util.Arrays;

public class RotateArray {
	
	public void rotateArrayByK(int[] arr,int d){
		int cnt=0;
		int[] temp = new int[d];
		for(int i=0;i<d;i++){
			temp[i]= arr[i];
		}
		System.out.println(Arrays.toString(temp));
		for(int i=d;i<arr.length;i++){
			arr[cnt]=arr[i];
			cnt++;
		}
		System.out.println(Arrays.toString(arr));
		int m=0;
		for(int i=cnt;i<arr.length;i++){
			arr[i]= temp[m];
			m++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		RotateArray rta = new RotateArray();
		int[] rtArray={1,2,3,4,5,6,7};
		rta.rotateArrayByK(rtArray, 2);
		
	}

}
