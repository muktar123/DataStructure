package org.test.ds.linkedlist;

public class DeleteAlternate {
	
	private ListNode a;

	public void deleteAlternate(ListNode head) {
		
		if(head==null) return;
		ListNode prev=head;
		ListNode next =head.next;
		while(prev!=null && next !=null) {
			
			prev.next=next.next;
			next=null;
			prev=prev.next;
			if(prev!=null) {
				next=prev.next;
			}
		}
	}
	
public void deleteAlternate1(ListNode head) {
		
		if(head==null) return;
		ListNode current =head.next;
		ListNode prev =head;
		int length= getLength(head);
		int cnt=0;
		for(int i=1;i<=length;i++) {
			if(length%i==0) {
				prev.next=current.next;
				cnt++;
				
			}else {
			cnt++;
			prev=current;
			current=current.next;
			}
		}
	}
		private int getLength(ListNode head) {
			ListNode curr = head;
			int count=0;
			while(curr!=null) {
				count++;
				curr=curr.next;
			}
	return count;
}

		public void display(ListNode node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}

		public static void main(String[] args) {
			DeleteAlternate rl = new DeleteAlternate();
			rl.a = new ListNode(1);
			rl.a.next = new ListNode(2);
			rl.a.next.next = new ListNode(3);
			rl.a.next.next.next = new ListNode(4);
			rl.a.next.next.next.next = new ListNode(5);
			rl.a.next.next.next.next.next = new ListNode(6);
//			ListNode aa = rl.reverseListIterative(a);
			rl.deleteAlternate1(rl.a);
			rl.display(rl.a);
			System.out.println();
		
		}

}
