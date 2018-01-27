package org.test.ds.linkedlist;

public class NthNodeFromEnd1 {
	ListNode a;
	public static ListNode getNthNodeFromEnd(ListNode root, int k){
		
		ListNode p1=root;
		ListNode p2=root;
		for(int i=0;i<k;i++){
			if(p1==null) return null;
			p1=p1.next;
		}
		while(p1!=null){
			p1=p1.next;
			p2= p2.next;
			
		}
		return p2;
	}
	public static void main(String[] args) {
		NthNodeFromEnd1 list = new NthNodeFromEnd1();
		list.a = new ListNode(1);
	    list.a.next = new ListNode(3);
	    list.a.next.next = new ListNode(5);
	    list.a.next.next.next = new ListNode(9);
	//    System.out.println(list.getNodeFromEnd(a, 1));
		System.out.println(getNthNodeFromEnd(list.a, 2).data);
	}

}
