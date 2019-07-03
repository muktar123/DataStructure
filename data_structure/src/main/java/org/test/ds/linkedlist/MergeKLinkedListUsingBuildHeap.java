package org.test.LinkedList;

public class MergeKLinkedListUsingBuildHeap {
	
	public static void minHeapify(int[] arr, int n, int i) {

		int smallest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr[smallest] > arr[l])
			smallest = l;

		if (r < n && arr[smallest] > arr[r])
			smallest = r;

		if (smallest != i) {
			int swap = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = swap;

			minHeapify(arr, n, smallest);
		}

	}

	public static void buildHeap(int[] arr, int n) {
		int startIndex = (n / 2) - 1;
		for (int i = startIndex; i >= 0; i--) {
			minHeapify(arr, n, i);// to get kth largest change to minHeapify
		}
	}
	static int kthLargest(int arr[], int size, int k){
		int[] minHeap = new int[k];
		for (int i = 0; i < k; i++) 
			minHeap[i] =arr[i];
			buildHeap(minHeap, k);
			for(int ii=k;ii<size;ii++)
		    {
		        if(arr[ii]>minHeap[0])
		        {
		            minHeap[0]=arr[ii];
		            minHeapify(minHeap,k,0);
		        }
		    }		
		return minHeap[0];
	}

	public static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(" " + arr[i]);			
		}
		System.out.println("");
	}

}
