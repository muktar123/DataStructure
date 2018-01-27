package org.test.ds.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	
	private Queue<Integer> q1= new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int d){
		if(q1.isEmpty()) q2.add(d);
		else q1.add(d);
	}
	public int pop(){
		int size=0,i=0;
		if(q1.isEmpty()){
			size=q2.size();
			while(i<size-1){
				q1.add(q2.poll());
				i++;
			}
		return q2.poll();
	}else{
		while(i<q1.size()-1){
			q2.add(q1.poll());
		    i++;
		}
		return q1.poll();
	}
}
	public static void main(String[] args) {
		StackUsingTwoQueues st = new StackUsingTwoQueues();
		Queue<Integer> q1= new LinkedList<Integer>();
		st.push(3);
		st.push(5);
		st.push(7);
		st.push(4);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
}
