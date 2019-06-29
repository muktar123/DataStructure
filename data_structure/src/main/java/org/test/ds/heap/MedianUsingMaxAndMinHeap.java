package org.test.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianUsingMaxAndMinHeap {

	public static double getMedian(int[] arr) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -1 * o1.compareTo(o2);
			}
		});
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		double medians = 0 ;
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			addNumber(number, maxHeap, minHeap);
			reBalance(maxHeap, minHeap);
			medians = getMedians(maxHeap, minHeap);
		}
		System.out.println(medians);
		return medians;
	}

	private static double getMedians(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
		PriorityQueue<Integer> biggerHeap = maxHeap.size() > minHeap.size() ? maxHeap : minHeap;
		PriorityQueue<Integer> smallerHeap = maxHeap.size() > minHeap.size() ? minHeap : maxHeap;
		if (biggerHeap.size() == smallerHeap.size()) {
			return ((double) biggerHeap.peek() + smallerHeap.peek()) / 2;
		} else {
			return biggerHeap.peek();
		}
	}

	private static void reBalance(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
		PriorityQueue<Integer> biggerHeap = maxHeap.size() > minHeap.size() ? maxHeap : minHeap;
		PriorityQueue<Integer> smallerHeap = maxHeap.size() > minHeap.size() ? minHeap : maxHeap;
		if (biggerHeap.size() - smallerHeap.size() >= 2) {
			smallerHeap.add(biggerHeap.poll());
		}

	}

	private static void addNumber(int number, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
		if (maxHeap.size() == 0 || number < maxHeap.peek()) {
			maxHeap.add(number);
		} else {
			minHeap.add(number);
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 9, 11, 10, 4, 3, 7, 1, 6};
		// for (int i = 0; i < arrA.length; i++) {
		System.out.println(getMedian(arr));
	//	System.out.println(getMedian(arr)[1]);

	}

}
