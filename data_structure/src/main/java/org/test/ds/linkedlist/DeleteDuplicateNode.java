package org.test.ds.linkedlist;

import java.util.HashSet;
import java.util.Hashtable;

public class DeleteDuplicateNode {

	public static ListNode head,a;

	public void insertFirst(int value) {
		ListNode firstNode = new ListNode(value);
		firstNode.next = head;
		head = firstNode;
	}

	public void deleteDuplicate(ListNode head) {
		Hashtable  hs = new Hashtable();
		ListNode current = head,prev=null;
		while (current != null) {
			if(hs.containsKey(current.data)){
				prev.next=current.next;
			}else{
			hs.put(current.data,true);
			prev=current;
					
		}
		current= current.next;
		}
}
	public ListNode deleteDuplicate1() {
		ListNode current =head;
		ListNode next_next;
		while(current.next!=null){
			if(current.data==current.next.data){
				next_next=current.next.next;
				current.next=null;
				current.next=next_next;
			}else{
				current =current.next;
			}
		}
		return head;
	}
	int FindMergeNode(ListNode headA, ListNode headB) {
	    
	    ListNode current1 =headA;
	    ListNode current2 =headB;
	    HashSet<Integer> hs = new HashSet<Integer>();
	    while(current1.next!=null){
	        hs.add(current1.data);
	        current1=current1.next;
	    }
	    while(current2.next!=null){
	        if(!hs.add(current2.data))
	        current2=current2.next;
	        return current2.data;
	    }
	    return current2.data;
	    

	    // Complete this function
	    // Do not write the main method. 

	}

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		DeleteDuplicateNode dn = new DeleteDuplicateNode();
/*		dn.insertFirst(10);
		dn.insertFirst(20);
		dn.insertFirst(20);
		dn.insertFirst(30);
		//System.out.println();
		dn.display(head);
		System.out.println();
		//HashSet<Integer> head1=dn.deleteDuplicate(head);
		ListNode head1=dn.deleteDuplicate1();
		System.out.println();
		dn.FindMergeNode(headA, headB)*/
		ListNode n1 = new ListNode(1);
		ListNode n3 = new ListNode(3);
		ListNode n5 = new ListNode(5);
		ListNode n7 = new ListNode(7);
		ListNode n9 = new ListNode(10);

        n1.next = n3;
        n3.next = n5;
        n5.next = n7;
        n7.next = n9;
        n9.next = null;

        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n6 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n10 = new ListNode(10);

        n2.next = n4;
        n4.next = n6;
        n6.next = n8;
        n8.next = n10;
        n10.next = null;
        
        dn.a = new ListNode(1);
        dn.a.next = new ListNode(3);
        dn.a.next.next = new ListNode(5);
        dn.a.next.next.next = new ListNode(5);
        dn.a.next.next.next.next = new ListNode(5);
        dn.a.next.next.next.next.next = new ListNode(5);

        
//        \\\ListNode headd =dn.deleteDuplicate1();
     //   int head11= dn.FindMergeNode(n1, n2);
         dn.deleteDuplicate(a);
   //  System.out.println(a);
		dn.display(a);;
		// dn.head=new ListNode(10);
	}

}
