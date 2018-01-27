package org.test.ds.stack;

public class StockSpan {
	
	public static void stockSpanCalculate(int[] arr, int n,int[] s){
		s[0]=1;
		for(int i=0;i<arr.length;i++){
			s[i]= 1;
			for(int j=i-1;j>=0 && arr[i]>=arr[j];j--){
				s[i]++;
			}
		}
		
	}
	 static void printArray(int arr[], int n)
	{
	    for (int i = 0; i < n; i++)
	      System.out.println((arr[i]));
	} 
	public static void main(String[] args) {
		int[] arr = {10, 4, 5, 90, 120, 80};
		int s[] = {1,1,1,1,1,1};
	stockSpanCalculate(arr, arr.length, s);
	printArray(s, arr.length);
	}

}
