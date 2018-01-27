package org.test.ds.linkedlist;

public class MergeSortLinkedList {

	public ListNode mergeSort(ListNode head) {
		
		ListNode oldHead =head;
		int mid = getLength(head)/2 ;
		if(head.next==null) return head;
		while(mid-1>0) {
			oldHead =oldHead.next;
			mid--;
			
		}
		ListNode newHead =oldHead.next;
		oldHead.next=null;
		oldHead=head;
		
		ListNode t1 =mergeSort(oldHead);
		ListNode t2 =mergeSort(newHead);
		return mergeList(t1,t2);

	}

	private ListNode mergeList(ListNode t1, ListNode t2) {
		ListNode head = new ListNode();
		ListNode head1=t1;
		ListNode head2=t2;
		if(t1==null) return t2;
		if(t2==null) return t1;
		
		if(head1!=null || head2!=null) {
			if(head1.data<head2.data) {
				head=head1;
				head.next=mergeList(head1.next, head2);
			}else {
				head=head2;
				head.next=mergeList(head2.next, head1);
			}
			
		}
		return head;
	}

	private int getLength(ListNode head) {
		int length=0;
		if(head==null) return 0;
		while(head!=null) {
			length++;
			head=head.next;
		}
		return length;
	}
	public static void main(String[] args) {
		MergeSortLinkedList msl = new MergeSortLinkedList();
		ListNode n1 = new ListNode(11);
		ListNode n3 = new ListNode(3);
		ListNode n5 = new ListNode(51);
		ListNode n7 = new ListNode(77);
		ListNode n9 = new ListNode(9);

		n1.next = n3;
		n3.next = n5;
		n5.next = n7;
		n7.next = n9;
		n9.next = null;
		ListNode result =msl.mergeSort(n1);
		msl.disp(result);
	}
	public void disp(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();

		}
	}

}
