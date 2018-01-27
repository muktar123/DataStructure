package org.test.ds.stack;

import java.util.Stack;

public class BuubleSortUsing2Stacks {

	private Stack<Integer> s1 = new Stack();
	private Stack<Integer> s2 = new Stack();

	int i = 0;

	public Stack sortArray(int[] arr) {
		for(int a :arr){
		s1.add(a);
		}
		while (!s1.isEmpty()){
			int top =s1.pop();
			while(!s2.isEmpty() && s2.peek()>top){
				s1.push(s2.pop());
			}
			s2.push(top);
			 
		}
		return s2;
		/*while(!s2.isEmpty()){
			System.out.print(s2.pop()+" ");
		}*/
	}

	public static void main(String[] args) {
		BuubleSortUsing2Stacks bs = new BuubleSortUsing2Stacks();
		int[] arr = { 5, 3, 6, 2, 1 };
		System.out.println(bs.sortArray(arr));
	}
}
