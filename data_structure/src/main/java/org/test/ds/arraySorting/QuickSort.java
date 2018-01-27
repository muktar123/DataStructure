package org.test.ds.arraySorting;

public class QuickSort {
		private int[] arrA;
	 
		public QuickSort(int[] arrA) {
			this.arrA = arrA;
		}
	 
		public void quickS(int low, int high) {
			int mid = (low + high) / 2;
			int left = low;
			int right = high;
			int pivot = arrA[mid]; // select middle element as pivot
			while (left <= right) {
				while (arrA[left] < pivot)
					left++;// find element which is greater than pivot
				while (arrA[right] > pivot)
					right--;
				
				if (left <= right) {
					int temp = arrA[left];
					arrA[left] = arrA[right];
					arrA[right] = temp;
					left++;
					right--;
				}
			}
			
		/*	arrA[low]=arrA[right];
			arrA[right]= pivot;*/
			
			// Recursion on left and right of the pivot
			if (low < right)
				quickS(low, right);
			if (left < high)
				quickS(left, high);
		}
	 
		public void display() {
			for (int i = 0; i < arrA.length; i++) {
				System.out.print(" " + arrA[i]);
			}
		}
	 
		public static void main(String[] args) throws java.lang.Exception {
			// your code goes here
			int a[] = { 6, 2, 7, 3, 5,1,11,10 };
			QuickSort i = new QuickSort(a);
			System.out.print("UnSorted : ");
			i.display();
			i.quickS(0, a.length - 1);
			System.out.println("");
			System.out.print("Quick Sorted : ");
			i.display();
		}
	}
