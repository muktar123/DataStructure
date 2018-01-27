package org.test.ds.linkedlist;

public class InsertAtTailInList {
	
	static ListNode head;

	ListNode InsertAtEnd(ListNode node,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		  
		ListNode current =head;
		if(head==null) {
		//	ListNode node = new ListNode();
	        node.data=data;
	        head=node;
	        return head;
	    }
		    while(current.next!=null){
		        current =current.next;
		    }
		  //  ListNode node = new ListNode();
		 node.data=data;
		    current.next=node;
node.next=null;
return current;
		}

	ListNode InsertAtFirst(ListNode node, int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		  
	//	ListNode current =head;
		  //  if(head==null) return null;
		   
	//	    ListNode node = new ListNode();
		    node.data=data;
		    node.next=head;
		   head = node;
		    return head;
		}
	public static void main(String[] args) {

		InsertAtTailInList list= new InsertAtTailInList();
		ListNode ln = new ListNode();
		ListNode head1 =list.InsertAtFirst(ln,11);
	//	ListNode head2 =
		ListNode ln1 = new ListNode();
				list.InsertAtEnd(ln1,55);
	//	ListNode head =list.Insert(ln1, 3);
	//	System.out.println();
	//	list.disp(head1);
	//	System.out.println();
		list.disp(head);

}
	public void  disp(ListNode head){
		ListNode current=head;
		while(current!= null){
			System.out.println(current.getData());
			current = current.getNext();
			
		}
	}
}