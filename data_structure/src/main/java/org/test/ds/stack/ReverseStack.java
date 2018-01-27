package org.test.ds.stack;

public class ReverseStack {
	
	public static void reverseStack(StackUsingArray stack) throws Exception{
		if(stack.isEmpty()) return;
		int x= stack.peek();
		//stack.push(x);
		System.out.println(x);
		reverseStack(stack);
	}
	/*public void print(){
		while(top.next!=null){
			System.out.println(top.data);
			top=top.next;
		}
	}*/
	public static void main(String[] args) throws Exception {
		StackUsingArray sll = new StackUsingArray(10);
		
		sll.push(100);
		sll.push(700);
		sll.push(400);
		sll.push(200);
	//	System.out.println(sll.peek());
		//sll.print();
		reverseStack(sll);// sll = new StackUsingLinkedList();
		sll.pop();
	//	sll.print();
	}

}
