package org.test.ds.linkedlist;

import org.test.ds.linkedlist.MergeInReverseOrder.ListNode;

public class MergeListsReversePractice {
	
	 static ListNode a, b;
	ListNode reverseMergeLists(ListNode head1,ListNode head2){
		
		ListNode current1=head1,current2=head2;
		 if (current1 == null && current2 == null) {
	            return null;
	    }		 
		 ListNode next_next,prev = null;
		 	while(current1!=null && current2!=null){
			if(current1.data<current2.data){
				next_next=current1.next;
				current1.next=prev;
				prev=current1;
				current1=next_next;
			}else{
				next_next=current2.next;
				current2.next=prev;
				prev=current2;
				current2=next_next;
			}
		}		
		while(current1!=null){
			next_next=current1.next;
			current1.next=prev;
			prev=current1;
			current1=next_next;
		}
		
		while(current2!=null){
			next_next=current2.next;
			current2.next=prev;
			prev=current2;
			current2=next_next;
		}
		return prev;
	}
	
	 void printlist(ListNode node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	  void printReverselist(ListNode node) {
	        while (node == null)  return;
	        printReverselist(node.next);  
	            System.out.print(node.data + " ");
	           // node = node.next;
	     //   }
	    }
	 
	 public static void main(String[] args) {
		 
	        MergeListsReversePractice list = new MergeListsReversePractice();
	        ListNode result = null;
	 
	        /*Let us create two sorted linked lists to test
	         the above functions. Created lists shall be
	         a: 5->10->15
	         b: 2->3->20*/
	        list.a = new ListNode(1);
	        list.a.next = new ListNode(3);
	        list.a.next.next = new ListNode(5);
	 
	        list.b = new ListNode(2);
	        list.b.next = new ListNode(4);
	        list.b.next.next = new ListNode(6);
	 
	        System.out.println("List a before merge :");
	        list.printlist(a);
	        System.out.println("");
	        System.out.println("List b before merge :");
	        list.printlist(b);
	 
	        // merge two sorted linkedlist in decreasing order
	        result = list.reverseMergeLists(a, b);
	        System.out.println("");
	        System.out.println("Merged linked list : ");
	        list.printlist(result);System.out.println();
	        list.printReverselist(result);
	 
	    }

}
