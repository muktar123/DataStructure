package org.test.ds.linkedlist;


public class ReverseAlternatekNnodesPrac {
	static ListNode  a;
	public static ListNode reverseAlternateKthOrder(ListNode root, int k){
		if(root ==null) return null;
		ListNode prev=null,next=null;
		ListNode current =root;
		int i=0;
		while(i<k && current!=null){
			next =current.next;
			current.next=prev;
			prev=current;
			current=next;
			i++;
		}
		if(next!=null)
			//reverseAlternateKthOrder(next, k);
			root.next=next;
		
		int m=0;
		while(m<k-1 && current!=null){
			current=current.next;
			m++;
		}
		if(current!=null){
			current.next=reverseAlternateKthOrder(current.next, k);
		}
		return prev;
	}
	
	public void display(ListNode node){
		while(node!=null){
			System.out.print(node.data +" ");
			node = node.next;
		}
	}
public static void main(String[] args) {
	ReverseAlternatekNnodesPrac list = new ReverseAlternatekNnodesPrac();
    ListNode result = null;

    /*Let us create two sorted linked lists to test
     the above functions. Created lists shall be
     a: 5->10->15
     b: 2->3->20*/
     a = new ListNode(1);
    a.next = new ListNode(3);
    a.next.next = new ListNode(5);
    a.next.next.next = new ListNode(7);
    a.next.next.next.next = new ListNode(9);
    a.next.next.next.next.next = new ListNode(2);
    ListNode node =reverseAlternateKthOrder(a, 2);
    list.display(node);	
	}

}
