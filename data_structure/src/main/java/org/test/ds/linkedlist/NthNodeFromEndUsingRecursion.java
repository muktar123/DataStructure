package org.test.ds.linkedlist;


class NthNodeFromEndUsingRecursion {
	
	private static Node a;
	int counter=0;
	public Node getNodeFromEnd(Node head, int nth){
		
		if(head!=null){
			
			getNodeFromEnd(head.next, nth);
			counter++;
			
			if(nth==counter) {
				System.out.println(head.data);
				return head;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		NthNodeFromEndUsingRecursion list = new NthNodeFromEndUsingRecursion();
		list.a = new Node(1);
	    list.a.next = new Node(3);
	    list.a.next.next = new Node(5);
	    list.a.next.next.next = new Node(9);
	    System.out.println(list.getNodeFromEnd(a, 1));
	}
}
