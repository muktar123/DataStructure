package org.test.ds.linkedlist;

public class RemoveAndCountCyclic {
	private static ListNode a;
	static int loopLength = 0;

	public static void isCyclic(ListNode head) {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		boolean flag = false;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (fastPtr == slowPtr) {
				flag = true;
				loopLength(fastPtr, slowPtr, flag);
				removeLoop(fastPtr, slowPtr);
				break;
			}
		}

	}

	private static void removeLoop(ListNode fastPtr, ListNode slowPtr) {
		slowPtr = slowPtr.next;
		while (slowPtr.next != fastPtr) {
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
		System.out.println("Loop breaks");
		printList(fastPtr);
	}

	private static void loopLength(ListNode fastPtr, ListNode slowPtr, boolean flag) {

		if (flag) {
			slowPtr = slowPtr.next;
			while (fastPtr != slowPtr) {
				loopLength++;
				slowPtr = slowPtr.next;
			}
		}
		System.out.println("Loop length :" + loopLength);
	}

	static void printList(ListNode ftr) {
		ListNode node = a;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		while (ftr.next != null) {
			System.out.print(ftr.data + " ");
			ftr = ftr.next;
		}
	}

	public static void main(String[] args) {
		// ListNode list = new ListNode();
		/*
		 * a = new ListNode(10); a.next = new ListNode(20); a.next.next = new
		 * ListNode(30); a.next.next.next = new ListNode(40); a.next.next.next.next =
		 * new ListNode(50); a.next.next.next.next.next = new ListNode(60);
		 * a.next.next.next.next.next.next = new ListNode(30);
		 * a.next.next.next.next.next.next = a.next.next;
		 */

		a = new ListNode(50);
		a.next = new ListNode(20);
		a.next.next = new ListNode(15);
		a.next.next.next = new ListNode(4);
		a.next.next.next.next = new ListNode(10);

		// Creating a loop for testing
		a.next.next.next.next.next = a.next.next;
		isCyclic(a);
		// printList();

	}

}
