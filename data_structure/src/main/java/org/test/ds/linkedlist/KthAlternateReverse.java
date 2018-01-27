package org.test.ds.linkedlist;

public class KthAlternateReverse {
	private static ListNode a;
	public ListNode KthAltReverse(ListNode head, int k){
		ListNode current = head, prev=null;
		ListNode next=null;
		int cnt=0;
		if(current ==null) return null;
		while(current!=null && cnt<k){
			next= current.next;
			current.next=prev;
			prev=current;
			current=next;
			cnt++;		
			System.out.println(head.data+" "+current.data+" " +prev.data);
		}
		if(next!=null){
			head.next=current;
			System.out.println(head.next.data+" "+current.data+" " +prev.data);
		}
		cnt=0;
		  while (cnt < k-1 && current != null) {
	            current = current.next;
	            cnt++;
	        }
		  if(current!=null)
			  current.next=KthAltReverse(current.next,k);
		  
		  return prev;
	}
	public void display(ListNode node){
		while(node!=null){
			System.out.print(node.data +" ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		KthAlternateReverse rl = new KthAlternateReverse();
		rl.a = new ListNode(1);
		a.next=new ListNode(2);
		a.next.next= new ListNode(3);
		a.next.next.next= new ListNode(4);
		a.next.next.next.next= new ListNode(5);
		a.next.next.next.next.next= new ListNode(6);
		ListNode  aa= rl.KthAltReverse(a, 2);
		rl.display(aa);
		
	}
	
	

}
