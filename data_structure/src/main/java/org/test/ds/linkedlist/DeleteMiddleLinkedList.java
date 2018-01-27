package org.test.ds.linkedlist;

public class DeleteMiddleLinkedList {

	ListNode Delete(ListNode head) {
		ListNode current = head;
		ListNode prev = null;
		int mid = getLength(head) / 2;
		// int mid=0;
		if (current == null)
			return null;
		// if(length%2==0){
		// mid = (length/2) +1
		// }
		while (mid > 0) {
			prev = current;
			current = current.next;
			mid--;
		}
		prev.next = current.next;
		return head;
	}

	int getLength(ListNode head) {
		ListNode h = head;
		int i = 0;
		while (h != null) {
			i++;
			h = h.next;
		}
		return i;
	}

	public static void main(String[] args) {
		DeleteMiddleLinkedList dml = new DeleteMiddleLinkedList();
		ListNode n1 = new ListNode(11);
		ListNode n3 = new ListNode(3);
		ListNode n5 = new ListNode(51);
	//	ListNode n7 = new ListNode(77);
		ListNode n9 = new ListNode(9);

		n1.next = n3;
		n3.next = n5;
		//n5.next = n7;
		n5.next = n9;
		n9.next = null;
		ListNode result = dml.Delete(n1);
		dml.disp(result);
		System.out.println();
		dml.disp(n1);
	}

	

	public void disp(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();

		}
	}
}
