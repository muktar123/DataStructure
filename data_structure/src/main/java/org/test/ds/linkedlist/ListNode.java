package org.test.ds.linkedlist;

public class ListNode {
	
	 public ListNode next;
	 public int data;
	public ListNode(int data){
		this.data = data;		
	}
	public ListNode(){
		
	}
	
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	

}
