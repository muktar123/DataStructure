package org.test.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

		private PriorityQueue<Integer> minHeap = null; 
		private PriorityQueue<Integer> maxHeap = null; 

		public MedianFinder() { 
			
		    minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
		        public int compare(Integer a, Integer b) {
		            return (b - a);
		        }
		    });   
		    maxHeap = new PriorityQueue();
		}

		// Adds a number into the data structure.
		public void addNum(int num) {
		    if(minHeap.size() == 0 || num <= minHeap.peek()) {
		        minHeap.add(num); 
		    } else {
		        maxHeap.add(num);
		    }
		    
		    balanceHeaps(); 
		}

		// Returns the median of current data stream
		public double findMedian() {
		    double median = 0; 
		    if(minHeap.size() == maxHeap.size()) { 
		        median = ((double)minHeap.peek() + (double)maxHeap.peek())/2;
		    } else { 
		        median = (minHeap.size() > maxHeap.size())? minHeap.peek() : maxHeap.peek(); 
		    }
		    return median; 
		}

		private void balanceHeaps() {
		    if(minHeap.size() - maxHeap.size() > 1) { 
		        maxHeap.add(minHeap.poll());     
		    } else if(maxHeap.size()- minHeap.size() > 1) {
		        minHeap.add(maxHeap.poll());
		    }
		}
		public static void main(String[] args) {
			MedianFinder mf1 = new MedianFinder();
			int[] arr = {5, 8, 2, 9, 11, 10, 4, 3, 7, 1, 6};
		
			for (int i = 0; i < arr.length; i++) {
				mf1.addNum(arr[i]);
			}
			System.out.println(mf1.findMedian());
		//	System.out.println(getMedian(arr)[1]);

		}
}
