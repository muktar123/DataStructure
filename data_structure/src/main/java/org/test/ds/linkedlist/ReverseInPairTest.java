package org.test.ds.linkedlist;


public class ReverseInPairTest {
	private static ListNode a;
	public static ListNode reverseAlternateTest(ListNode root, int k){
		
		
		ListNode current =root;
		if(current ==null) return  null;
		ListNode prev=null, next=null;
		int i=0;
		while(current!=null && i<k){
		next = current.next;
		current.next=prev;
		prev=current;
		current=next;
		i++;
		
		}
		if(next!=null){
			root.next =reverseAlternateTest(next,k);
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
	ReverseInPairTest list = new ReverseInPairTest();
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
    ListNode node =reverseAlternateTest(a, 3);
    list.display(node);

}
}
