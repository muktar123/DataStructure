package org.test.ds.linkedlist;

public class MergeLinkedListJan2218 {

	ListNode head;

	public ListNode mergeListsRecursive(ListNode head1, ListNode head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		ListNode head = new ListNode();
		if (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				head = head1;
				head.next = mergeListsRecursive(head1.next, head2);
			} else {
				head = head2;
				head.next = mergeListsRecursive(head2.next, head1);
			}

		}
		return head;

	}

	public ListNode mergeListsIterative(ListNode head1, ListNode head2) {

		ListNode head = new ListNode(0);
		ListNode current = head;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				current.next = head1;
				head1 = head1.next;
			} else {
				current.next = head2;
				head2 = head2.next;
			}
			current = current.next;

		}
		return head;

	}

	public static void main(String[] args) {
		MergeLinkedListJan2218 list = new MergeLinkedListJan2218();
		ListNode n1 = new ListNode(1);
		ListNode n3 = new ListNode(3);
		ListNode n5 = new ListNode(5);
		ListNode n7 = new ListNode(7);
		ListNode n9 = new ListNode(9);

		n1.next = n3;
		n3.next = n5;
		n5.next = n7;
		n7.next = n9;
		n9.next = null;

		ListNode n2 = new ListNode(2);
		ListNode n4 = new ListNode(4);
		ListNode n6 = new ListNode(6);
		ListNode n8 = new ListNode(8);
		ListNode n10 = new ListNode(10);

		n2.next = n4;
		n4.next = n6;
		n6.next = n8;
		n8.next = n10;
		n10.next = null;

		// ListNode node = list.mergeListsRecursive(n1, n2);
		ListNode node = list.mergeListsIterative(n1, n2);
		list.disp(node.next);

	}

	public void disp(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();

		}
	}

}
