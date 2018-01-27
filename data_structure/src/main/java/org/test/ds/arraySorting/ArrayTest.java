package org.test.ds.arraySorting;

public class ArrayTest {
	
	public static void arrayTest(int arr[],int n){
		 int [] bucket=new int[n+1];
		 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;
	         bucket[i]=3;
	      }
	 
	      for (int i=0; i<arr.length; i++) {
	         bucket[arr[i]]++;
	      }
	}
	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5};
		arrayTest(arr, 5);
	}

}
