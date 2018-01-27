package org.test.ds.arraySorting;

import java.util.Arrays;
//first split the array and then merge
public class MergeSort {
	private int [] arrAux;
	private int [] arr;
	//arrAux = new int[arr.length];
	
	public MergeSort(int [] arrInput){
		this.arr = arrInput;
		int arrSize = arr.length;
		arrAux = new int [arrSize];
	}
	public  void mergeSort1(int low,int high){
		if(low<high){
			int mid = (low+high)/2;
		mergeSort1(low,mid);//spliting
		mergeSort1(mid+1,high);//spliting
		merging(low,mid,high);//merging
		}	
	}

	private  void merging(int low, int mid, int high) {
		
		
		for(int i=low;i<=high;i++){
			arrAux[i]=arr[i];
		}
		int i = low;
		int j = mid+1;
		int k = low;
		while(i<=mid && j<=high){
			if(arrAux[i]<=arrAux[j]){
				arr[k]=arrAux[i];
				i++;
			}else{
				arr[k]= arrAux[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			arr[k]=arrAux[i];
			i++;
			k++;
	}
	//	System.out.println(Arrays.toString(arr));

}
	public static void main(String[] args) {
		
	
	int [] a = {2,1,6,3,9,4,5,10};
	MergeSort m = new MergeSort(a);
	 m.mergeSort1(0,a.length-1);
	 System.out.println(Arrays.toString(a));
}
}