package org.test.heap;

public class RopeMinSum {

	public int size;
	public int mh[];
	public int position;

	public RopeMinSum(int size) {
		this.size = size;
		position = 0;
		mh = new int[size+1];
	}

	public void createHeap(int arr[]) {
		if (arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				insert(arr[i]);
			}
		}
	}

	private void insert(int i) {
		if (position == 0) {
			mh[position + 1] = i;
			position = 2;
		} else {
			mh[position++] = i;
			bubbleUp();
		}
	}

	private void bubbleUp() {
		int pos = position - 1;
		while (pos / 2 > 0 && mh[pos] < mh[pos / 2]) {
			int y = mh[pos];
			mh[pos] = mh[pos / 2];
			mh[pos / 2] = y;
			pos = pos / 2;
		}
	}
	
	public int extractMin() {
		int x = mh[1];
		mh[1] = mh[position -1];
		mh[position -1]=0;
		position--;
		sinkDown(1);
		return x;
	}
	private boolean isOneElement() {
		return position==2;
	}
	
	public int RopeMinSum() {	
		int sum =0;
		while(isOneElement()) {
			int first = extractMin();
			int second = extractMin();
			sum += first + second;
			insert(first+second);
			
		}
		return sum;
	}

	private void sinkDown(int i) {
		int smallest = i;
		if(2*i< position && mh[2*i]<mh[smallest]) 
			smallest =2*i;
		if(2*i+1 <position && mh[2*i+1]< mh[smallest])
			smallest =2*i+1;
		
		if(i!=smallest) {
			swap(i, smallest);
			sinkDown(smallest);
		}
	}

	private void swap(int i, int smallest) {
		int t = mh[i];
		mh[i] = mh[smallest];
		mh[smallest] =t;
	}
	public void display(){
		for(int i=1;i<mh.length;i++){
			System.out.print(" " + mh[i]);			
		}
		System.out.println("");
	}
	
	public static void main(String args[]){
		int arrA [] = {3,2,1,7,8,4,10,16,12};
		System.out.print("Original Array : ");
		for(int i=0;i<arrA.length;i++){
			System.out.print("  " + arrA[i]);
		}
		RopeMinSum m = new RopeMinSum(arrA.length);
		System.out.print("\nMin-Heap : ");
		m.createHeap(arrA);		
		m.display();
		System.out.print("Extract Min :");
		/*
		 * for(int i=0;i<arrA.length;i++){ System.out.print("  " + m.extractMin()); }
		 */
		System.out.println(m.RopeMinSum());
		
	}

}
