package org.test.ds.linkedlist;

public class AlternateReverseKth {

	private static ListNode a;

	public ListNode printAlternate(ListNode head, int k) {

		ListNode current, prev = null, next_next = null;
		current = head;
		if (head == null)
			return null;
		int cnt = 0;
		while (current != null && cnt < k) {
			next_next = current.next;
			current.next = prev;
			prev = current;
			current = next_next;
			cnt++;
		}
		if (next_next != null)
			head.next = current;
		cnt = 0;
		while (current != null && cnt < k - 1) {
			current = current.next;
			cnt++;
		}
		if (current != null)
			current.next = printAlternate(current.next, k);
		return prev;
	}

	public void display(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		AlternateReverseKth rl = new AlternateReverseKth();
		rl.a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		a.next.next.next.next = new ListNode(5);
		a.next.next.next.next.next = new ListNode(6);
		ListNode aa = rl.printAlternate(a, 2);
		rl.display(aa);

	}

}
