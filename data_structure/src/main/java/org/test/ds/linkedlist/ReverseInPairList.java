package org.test.ds.linkedlist;

public class ReverseInPairList {
	
	private static Node a;

	public Node reverse(Node head, int k){
		
		Node current =head;
		if(current == null) return null;
		int cnt =0;
		Node prev=null,next=null;
		while(cnt<k && current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		//	current = current.next;		
			cnt++;
		}
		if(next!=null)
			head.next=reverse(next, k);
		return prev;
	}
	public void display(Node node){
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		
		ReverseInPairList rl = new ReverseInPairList();
		rl.a = new Node(1);
		a.next=new Node(2);
		a.next.next= new Node(3);
		a.next.next.next= new Node(4);
		
		Node n =rl.reverse(a, 2);
		rl.display(n);
	}

}
