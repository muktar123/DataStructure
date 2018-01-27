package org.test.ds.linkedlist;

public class ReverseInPair {

	 private static ListNode head1;
	 ListNode reverse(ListNode head, int k)
	    {
		 ListNode current = head;
		 ListNode next = null;
		 ListNode prev = null;
	        if(current== null) return null;
	       int count = 0;
	 
	       /* Reverse first k nodes of linked list */
	       while (count < k && current != null) 
	       {
	           next = current.next;
	           current.next = prev;
	           prev = current;
	           current = next;
	           count++;
	       }
	 
	       /* next is now a pointer to (k+1)th node 
	          Recursively call for the list starting from current.
	          And make rest of the list as next of first node */
	       if (next != null) 
	          head.next = reverse(next, k);
	 
	       // prev is now head of input list
	       return prev;
	    } 
	 public void display(ListNode head){
			ListNode current=head;
			while(current!=null){
				System.out.print(current.data+" ");
				current = current.next;
			}
	 }
	 public static void main(String[] args) {
		 ReverseInPair list = new ReverseInPair();
	     list.head1 = new ListNode(1);
	        list.head1.next = new ListNode(2);
	        list.head1.next.next = new ListNode(3);
	       list.head1.next.next.next = new ListNode(4);
	       list.head1.next.next.next.next = new ListNode(5);
	       list.head1.next.next.next.next.next = new ListNode(6);
	       list.head1.next.next.next.next.next.next = new ListNode(7);
	       list.head1.next.next.next.next.next.next.next = new ListNode(8);
	 
	        ListNode head= list.reverse(head1, 2);
	        list.display(head);
	}
}
