package org.test.ds.linkedlist;

public class LinkedListTestJan2218 {

	ListNode head;
	public static ListNode head1;
	public static ListNode head2;

	public ListNode InsertAtFirst(ListNode node, int data) {
		node.data = data;
		node.next = null;
		head = node;
		return head;

	}

	public ListNode InsertAtEnd(ListNode node, int data) {
		ListNode current = head;
		if (head == null) {
			node.data = data;
			node.next = null;
			head = node;
			return head;
		}

		while (current.next != null) {
			current = current.next;
		}
		node.data = data;

		current.next = node;
		node.next = null;
		return current;
	}

	public int intersectionPoint(ListNode L1, ListNode L2) {
		ListNode curr1 = L1;
		ListNode curr2 = L2;
		int d1 = getLength(L1);
		int d2 = getLength(L2);
		int d=0;
		if(d1>d2) {
			d= d1-d2;
			return finIntersectionPoint(d,curr1,curr2);
		}else {
			d=d2-d1;
			return finIntersectionPoint(d,curr2,curr1);
		}
		
			

	}

	private int finIntersectionPoint(int d, ListNode curr1, ListNode curr2) {
		
		ListNode curr11 =curr1;
		ListNode curr22=curr2;
		for(int i=0;i<d;i++) {
			curr11=curr11.next;
		}
		while(curr11!=null && curr22!=null) {
			if(curr11.data==curr22.data) {
				return curr11.data;
			}
			curr11= curr11.next;
			curr22= curr22.next;
		}
		return -1;
		
	}

	private int getLength(ListNode curr) {
		int i = 0;
		while (curr != null) {
			i++;
			curr = curr.next;
		}
		return i;

	}

	public static void main(String[] args) {
		LinkedListTestJan2218 list = new LinkedListTestJan2218();
/*		ListNode lt = new ListNode();
		ListNode current = llt.InsertAtFirst(lt, 10);
		ListNode ln1 = new ListNode();
		llt.InsertAtEnd(ln1, 55);
		llt.disp(lt);*/
		
		  list.head1 = new ListNode(3);
	        list.head1.next = new ListNode(6);
	        list.head1.next.next = new ListNode(9);
	        list.head1.next.next.next = new ListNode(15);
	        list.head1.next.next.next.next = new ListNode(30);
	 
	        // creating second linked list
	        list.head2 = new ListNode(10);
	        list.head2.next = new ListNode(15);
	        list.head2.next.next = new ListNode(30);
	 
	        System.out.println("The node of intersection is " + list.intersectionPoint(list.head1, list.head2));
	}

	public void disp(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();

		}
	}
}
