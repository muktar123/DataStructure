package org.test.ds.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
	
	private Queue<Integer> q1= new LinkedList<Integer>();

	public void push(int d){
		
		 q1.add(d);
			int size=q1.size();
			while(size>1){
				q1.add(q1.poll());
				size--;
			
		}
	}
	
	public int pop(){
		if(q1.isEmpty())
			System.out.println("queue is empty");
		
	 return q1.poll();
	}
/*	public int peek(){
		if(q1.isEmpty())
			System.out.println("queue is empty");
		
	 return q1.peek();
	}*/
	public static void main(String[] args) {
		StackUsingSingleQueue st = new StackUsingSingleQueue();
		//Queue<Integer> q1= new LinkedList<Integer>();
		st.push(3);
		st.push(15);
		st.push(7);
		st.push(4);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		//System.out.println(st.peek());
		
	}

}
