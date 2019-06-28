package org.test.heap;

public class BuildHeap {
	/**
	 * To find kth smallest element from heap using addition kth space,
	 * to find kth smallest use max heap of kth size
	 * to find kth largest use min heap of kth size
	 * @param arr
	 * @param n
	 * @param i
	 */

	public static void maxHeapify(int[] arr, int n, int i) {

		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr[largest] < arr[l])
			largest = l;

		if (r < n && arr[largest] < arr[r])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			maxHeapify(arr, n, largest);
		}

	}
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
			maxHeapify(arr, n, i);// to get kth largest change to minHeapify
		}
	}
	static int kthSmallest(int arr[], int size, int k){
		int[] minHeap = new int[k];
		for (int i = 0; i < k; i++) 
			minHeap[i] =arr[i];
			buildHeap(minHeap, k);
			for(int ii=k;ii<size;ii++)
		    {
		        if(arr[ii]<minHeap[0])
		        {
		            minHeap[0]=arr[ii];
		            maxHeapify(minHeap,k,0);
		        }
		    }

		
		return minHeap[0];
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
	
	public void heapSort(int arr[], int n) {
		buildHeap(arr, n);
	}

	public static void main(String[] args) {
		{
			// Binary Tree Representation
			// of input array
			// 1
			// / \
			// 3 5
			// / \ / \
			// 4 6 13 10
			// / \ / \
			// 9 8 15 17
		//	int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
			int arr[] = {9,2,3,6,8,4,5,1,7};


			int n = arr.length;
			System.out.println(kthSmallest(arr, n, 3));
			System.out.println(kthLargest(arr, n, 3));

			//buildHeap(arr, n);
			display(arr);
		}

	}
}