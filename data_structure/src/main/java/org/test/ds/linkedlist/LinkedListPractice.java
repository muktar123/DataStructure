package org.test.ds.linkedlist;

import java.util.HashSet;

public class LinkedListPractice {
	
	static ListNode head;
	public void insert(int new_value){
		ListNode ln = new ListNode(new_value);
		ln.setNext(head);
		head= ln;	
		
	}
	public void printList(ListNode head){
		ListNode current = head;
		while(current!=null){
			System.out.print(current.getData()+"  ");
			current= current.getNext();
		}
	}
	
	public ListNode reverseList(ListNode head){
		ListNode prvPtr = null,current=head,nextPtr;
		while(current!=null){
			nextPtr =current.getNext();
			current.setNext(prvPtr);
			prvPtr = current;
			current = nextPtr;		
		
			
		}
		return prvPtr;
	}
	
	public void insertInPosition(ListNode link,int pos){
		ListNode current=head,prev=null;
		int count=1;
		if(head!=null && pos==1){
			link.next=head;
			head=link;
		}
		if(pos>1){
		while(current!=null && count<pos){
			count++;
			prev=current;
			current=current.next;
		}
		prev.next=link;
		link.next=current;
		}
	}
	public void insertInSorting(ListNode link){
		ListNode current=head,prev=null;
		if(head==null){
			link.next=head;
			head=link;
		}
		else{
		while(current!=null && current.data<link.data){
			prev=current;
			current=current.next;
		}
		prev.next=link;
		link.next=current;
		}
	}
	
	public int delete(int key){
		ListNode current=head,prev=null;
		while(current!=null && current.data!=key){
			prev=current;
			current= current.next;
		}
		if(current==null) {
			System.out.printf("\nKey %d not present in list",key);
			return 0;
		}
		prev.next=current.next;
		return current.data;
		
	}
	public ListNode deleteFirst(){
		ListNode temp=head;
		head=head.next;
		return temp;		
	}
	public void rotate(int pos){
		ListNode current=head,prev=null;
		int cnt=0;
		while(current!=null && cnt<pos){
			cnt++;
			prev=current;
			current=current.next;
		}
/*		if (current == null)
            return;*/
		while(current.next!=null){
			current=current.next;
		}
		current.next=head;
		head=prev.next;
		prev.next=null;
		
	}
	
	public boolean isCyclic(ListNode head){
		HashSet<ListNode> set = new HashSet<ListNode>();
		ListNode current = head;
		while(current != null){			
			if(!set.add(current)){
				return true;
			}
			current=current.next;
		}
		
		return false;
	}
	public boolean isCyclic1(ListNode head){
		ListNode current=head,prev=head;
		int cnt=0;
		
		while(current != null && current.next.next!=null){
			prev=prev.next;
			current=current.next.next;
			if(prev==current)
				return true;			
		}	
		return false;
	}
	public void findLoop(){
		ListNode ptrOne =head;
		ListNode ptrTwo =head.next.next;
		while(ptrOne!=null){
			if(ptrOne!=ptrTwo){
				ptrOne = ptrOne.next;
				ptrTwo = ptrTwo.next.next;
			}
			else{
				System.out.println("");
				System.out.println("Loop Found--starts at " + ptrOne.data);
				findLoopLength(ptrOne, ptrTwo);///Loop LEANGTH
				breakLoop(ptrOne, ptrTwo);    //// BREAK LOOP
				break;
			}
		}
	}
	public static void findLoopLength(ListNode one, ListNode two){
		one = one.next;
		int loopLength = 1;
		while(one!=two){
			one = one.next;
			loopLength++;
		}
		System.out.println("Loop length is " + loopLength);
	}
	public static void breakLoop(ListNode one, ListNode two){
		one = one.next;
		while(one.next!=two){
			one = one.next;
		}
		one.next = null;
		System.out.println("Loop breaks");
		
	}
	
	public static void main(String[] args) {
		LinkedListPractice lp = new LinkedListPractice();
	/*	lp.head=new ListNode(10);
		lp.head.next=new ListNode(20);
		lp.head.next.next=new ListNode(30);
		lp.head.next.next.next=new ListNode(40);*/
	//	lp.head.next.next.next.next=new ListNode(20);
	//	head.next.next.next.next.next=head.next.next;//for cyclic
	lp.insert(10);
	lp.insert(20);
	lp.insert(30);
		lp.insert(40);		
		lp.insert(50);
		System.out.println("Given Linked list");
	//	lp.printList(head);
	//	head=lp.reverseList(head);
	//	 System.out.println("\nReversed linked list ");
	//	lp.printList(head);
	//	lp.delete(102);
		//lp.deleteFirst();
	//	ListNode link=new ListNode(45);
	//	lp.insertInPosition(link, 3);
	//	lp.insertInSorting(link);
	//	System.out.println(lp.isCyclic(head));
	//	System.out.println();
	//	lp.printList(head);
		lp.printList(head);
		lp.rotate(2);
		System.out.println();
		lp.printList(head);
	}
	
}
