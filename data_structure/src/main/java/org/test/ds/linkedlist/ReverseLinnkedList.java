package org.test.ds.linkedlist;

public class ReverseLinnkedList {
	
	static ListNode a;

	public ListNode reverseListIterative(ListNode head) {
		
		ListNode current = head;
		ListNode prev=null, next;
		while(current!=null) {
			next =current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		return prev;
		
	}
public void reverseListRecursive(ListNode head) {
		
		ListNode current = head;

		if(current!=null) {
			
			reverseListRecursive(current.next);
			System.out.print(current.data+ " ");
			
		}
	
		
	}

	
	public void display(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinnkedList rl = new ReverseLinnkedList();
		rl.a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		a.next.next.next.next = new ListNode(5);
		a.next.next.next.next.next = new ListNode(6);
//		ListNode aa = rl.reverseListIterative(a);
		rl.display(a);
		System.out.println();
		rl.reverseListRecursive(a);
	}

}
