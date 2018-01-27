package org.test.ds.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingTwoQPrac {

	private Queue<Integer> q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int d){
		if(q1.isEmpty()) q2.add(d);
		else q1.add(d);
	}
	public int pop(){
		int i=0, size=0;
		if(q1.isEmpty()){
			size=q2.size();
			while(i<size-1){
				q1.add(q2.poll());
				i++;
			}
			return q2.poll();
		} else{
			size =q1.size();
			while(i<size-1){
				q2.add(q1.poll());
				i++;
			}
			return q1.poll();
		}
		
	}
	public void disp(Queue st){
		while(!st.isEmpty()){
			System.out.println(st.peek());
		}
	}
	
	public static void main(String[] args) {
		StackUsingTwoQPrac st = new StackUsingTwoQPrac();
		st.push(5);
		st.push(8);
		st.push(7);
		//st.disp();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		}
}
