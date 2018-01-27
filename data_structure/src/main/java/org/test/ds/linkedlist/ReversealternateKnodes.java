package org.test.ds.linkedlist;

public class ReversealternateKnodes {
	
	public static Node a;

	public Node reverse(Node head, int k){
		
		Node prev=null, next=null;
		Node current= head;
		int cnt=0;
		while(cnt<k && current!=null){
			 next=current.next;
			 current.next=prev;
			 prev=current;
			 current=next;
			 cnt++;
		}
		  /* 2) Now head points to the kth node.  So change next 
        of head to (k+1)th node*/
       if (next != null) {
           head.next = current;
       }

       /* 3) We do not want to reverse next k nodes. So move the current 
        pointer to skip next k nodes */
       int count = 0;
       while (count < k-1  && current != null) {
           current = current.next;
           count++;
       }

       /* 4) Recursively call for the list starting from current->next.
        And make rest of the list as next of first node */
       if (current != null) {
           current.next = reverse(current.next, k);
       }

       /* 5) prev is new head of the input list */
       return prev;
		
		
	}
	public void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		
		ReversealternateKnodes rl = new ReversealternateKnodes();
		rl.a = new Node(1);
		a.next=new Node(2);
		a.next.next= new Node(3);
		a.next.next.next= new Node(4);
		a.next.next.next.next= new Node(5);
		a.next.next.next.next.next= new Node(6);
		a.next.next.next.next.next.next= new Node(7);
		a.next.next.next.next.next.next.next= new Node(8);
		
		Node n =rl.reverse(a, 3);
		rl.display(n);
	}



}
