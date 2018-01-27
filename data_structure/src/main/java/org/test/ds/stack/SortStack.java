package org.test.ds.stack;

import java.util.Stack;

public class SortStack {
	
	public static Stack<Integer> sortStack(Stack<Integer> st){
		Stack<Integer> rt = new Stack<Integer>();
		while(!st.isEmpty()){
			int tmp =st.pop();
			while(!rt.isEmpty() && rt.peek()> tmp){
				st.push(rt.pop());
			}
			rt.push(tmp);
		}
		return rt;
	}
	public static void main(String[] args) {
		SortStack ss = new SortStack();
		Stack<Integer> s = new Stack<Integer>();
		s.push(15);
		s.push(5);
		s.push(25);
		s.push(10);
		System.out.println(sortStack(s));
	}

}
