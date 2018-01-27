package org.test.ds.stack;

import org.test.ds.linkedlist.ListNode;

public class StackUsingLinkedList {

	private int length;
	private static ListNode top;
	
	StackUsingLinkedList(){
		top=null;
		length=0;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	public int size(){
		return length;
	}
	public void push(int data){
		ListNode ls = new ListNode(data);
		ls.next=top;
		top=ls;
		length++;
	}
	public int pop() throws Exception{
		if(isEmpty()) throw new Exception("stack empty");
		int result=top.getData();
		top = top.next;
		length--;
		return result;
	}
	public int peek() throws Exception{
		if(isEmpty()) throw new Exception("stack empty");
		return top.getData();
	}
	public void print(){
		while(top.next!=null){
			System.out.println(top.data);
			top=top.next;
		}
	}
	public static void main(String[] args) throws Exception {
		StackUsingLinkedList sll = new StackUsingLinkedList();
		sll.push(100);
		sll.push(700);
		sll.push(400);
		sll.push(200);
	//	System.out.println(sll.peek());
		//sll.print();
		sll.pop();
		sll.print();
	}
}
