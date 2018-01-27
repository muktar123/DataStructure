package org.test.ds.linkedlist;

import java.util.HashMap;
import java.util.Hashtable;

public class IntersectionPointsOfListsUsingHashTable {

	static ListNode head1;
	static ListNode head2;

	public int findMergePoint() {

		ListNode current1 = head1;
		ListNode current2 = head2;
		Hashtable table = new Hashtable();
		while (current1 != null) {
			table.put(current1.data, true);
			current1 = current1.next;
		}
		while (current2 != null) {
			if (table.containsKey(current2.data)) {
				return current2.data;
			} else {
				current2 = current2.next;

			}
		}
		return 0;

	}
	public static void main(String[] args) {
		 IntersectionPointsOfListsUsingHashTable list = new IntersectionPointsOfListsUsingHashTable();
	 
	        // creating first linked list
	        list.head1 = new ListNode(3);
	        list.head1.next = new ListNode(6);
	        list.head1.next.next = new ListNode(9);
	        list.head1.next.next.next = new ListNode(30);
	        list.head1.next.next.next.next = new ListNode(330);
	 
	        // creating second linked list
	        list.head2 = new ListNode(10);
	        list.head2.next = new ListNode(25);
	        list.head2.next.next = new ListNode(30);
	 
	        System.out.println("The node of intersection is " + list.findMergePoint());
	 
	    }
}
