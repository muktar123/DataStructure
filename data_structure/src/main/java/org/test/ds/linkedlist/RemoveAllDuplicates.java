package org.test.ds.linkedlist;

public class RemoveAllDuplicates {
	
	public void removeDuplicateNodes(ListNode head) {
		ListNode current =head;
		if(head == null){
            return;
        }
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next =current.next.next;
			}else {
				current=current.next;
			}
		}
	}
	public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(5);
		ListNode n7 = new ListNode(7);
		ListNode n9 = new ListNode(9);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n9;
		n9.next = null;

        RemoveAllDuplicates rad = new RemoveAllDuplicates();
        rad.removeDuplicateNodes(n1);
        rad.printList(n1);

}
	 public void printList(ListNode head){
	        while(head != null){
	            System.out.println(head.data);
	            head = head.next;
	        }
	    }
}