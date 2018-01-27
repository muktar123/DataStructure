package org.test.ds.arraySorting;

public class KthSmallestOfTwoSortedArrays {
	
	public static int sortedArray(int a[],int b[],int m , int n, int k){
		int sorted[] = new int[m+n];
		int kk=sorted.length;
		int ii=0;
		int i=0,j=0;
		int c=0;
		while(c<kk){
			if(i<m){
				sorted[c]= a[i];				
				i++;
			}else{
				sorted[c] = b[j];				
				j++;
			}
			c++;
		}
		while(i<m){
			sorted[c]= a[i];
			c++;
			i++;
		}
		while(j<n){
			sorted[c]= b[j];
			c++;
			j++;

		}
		return sorted[k-1];
	}
	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5};
		int arr1[] ={6,7,8,9,10};
		System.out.println(sortedArray(arr, arr1, arr.length-1, arr1.length-1, 8));
		
	}

}
