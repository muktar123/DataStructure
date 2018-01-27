package org.test.ds.linkedlist;

public class IntersectionPointsOfLists {
	
	public static ListNode head1;
	public static ListNode head2;
	
	public int getNodeCount(ListNode head){
		ListNode current = head;
		int count =0;
		while(current.next !=null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	public int getNode(){
		int d1=0,d2=0,d=0;
		 d1= getNodeCount(head1) ;
		 d2 = getNodeCount(head2);
		
		if(d1>d2){
			d= d1-d2;		
			return getIntersection(d,head1,head2);
		}else{
			d= d2-d1;
			return getIntersection(d,head2,head1);
	    }
	}
	private int getIntersection(int d1, ListNode head12, ListNode head22) {
		 ListNode current1= head12;
		 ListNode current2 =head22;
		 for(int i=0;i<d1;i++){		
			current1 =current1.next;					
		}
		 while(current1!=null && current2!=null){
			 if(current1.data == current2.data){
				 return current1.data;
			 }
			 current1 = current1.next;
			 current2 = current2.next;
		 }
		return -1;
	}
	
	 public static void main(String[] args) {
		 IntersectionPointsOfLists list = new IntersectionPointsOfLists();
	 
	        // creating first linked list
	        list.head1 = new ListNode(3);
	        list.head1.next = new ListNode(6);
	        list.head1.next.next = new ListNode(9);
	        list.head1.next.next.next = new ListNode(15);
	        list.head1.next.next.next.next = new ListNode(30);
	 
	        // creating second linked list
	        list.head2 = new ListNode(10);
	        list.head2.next = new ListNode(15);
	        list.head2.next.next = new ListNode(30);
	 
	        System.out.println("The node of intersection is " + list.getNode());
	 
	    }
	}


