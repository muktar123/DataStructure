package org.test.ds.stack;

public class ReverseStackUsingPushPop {
	
	public static void reverseStack(StackUsingArray stack) throws Exception{
		
		if(stack.isEmpty()) return;
		
		int temp =stack.pop();
		System.out.println(temp);
		reverseStack(stack);
		insertAtBottom(stack, temp);
				
	}

	private static void insertAtBottom(StackUsingArray stack, int data) throws Exception {

		if(stack.isEmpty()){
			stack.push(data);
			return;
		}
		int temp =stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);
		
	}
	
	public static void main(String[] args) throws Exception {
		ReverseStackUsingPushPop sua = new ReverseStackUsingPushPop();
		StackUsingArray su = new StackUsingArray(4);
		su.push(10);
		su.push(20);
		su.push(30);
		su.push(40);
	//	su.display();
		sua.reverseStack(su);
		su.display();
	}

}
