package org.test.ds.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {
	
	PriorityQueue<Integer> pq ;
				
	int[] pqArray;
	public PriorityQ(int a[]){
		this.pqArray =a;
		pq= new PriorityQueue<Integer>(pqArray.length,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
	}
	
	public void insert(int a[]){
		for(int i=0;i<a.length;i++)
		   pq.add(a[i]);
	}
	
	public int peek(){
		return pq.peek();
	}
	
	public int delete(){
		int x=pq.poll();
		return x;
	}
	public int Kthdelete(int k){
		int x=0;
		int rev=0;
		for(int i=0;i<k;i++){
		 x=pq.poll();	
		rev+=x;
		pq.offer(--x);
		}
		return rev;
	}
	public void display(){
		System.out.println(pq);
	}
	
	public static void main(String[] args) {
		int[] aa={5, 1, 7, 10, 11, 9};
		PriorityQ pq = new PriorityQ(aa);
		
		pq.insert(aa);
		System.out.println(pq.peek());
	//	System.out.println(pq.delete());
		System.out.println(pq.Kthdelete(5));
		
	}

}
