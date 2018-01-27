package org.test.ds.linkedlist;


public class NthNodeFromTail {
	
	static ListNode a;
	ListNode head;
	int GetNode(ListNode head,int n) {
	    
		ListNode current=head;
		
	    int len= getListLength(current);
	    if (len < n)
            return 0;
	   for(int i=0;i<len-n-1;i++){
	       current=current.next;
	   }
	    return current.data;

	}

	 public void printList(ListNode head)
	    {
		 ListNode tNode = head;
	        while (tNode != null)
	        {
	            System.out.print(tNode.data+" ");
	            tNode = tNode.next;
	        }
	    }
	 
	 ListNode Delete(ListNode head, int position) {
		 ListNode current =head;
		 ListNode prev=null;
		    int length = getListLength(current);
		    if(length<position) return head;
		    if (position == 0) {
		    	ListNode temp =head;
		        head = head.next;
		        return head;
		    }
		    int i=1;
		    for(i=0;i<position && current!=null;i++){
		        prev=current;
		        current=current.next;
		    }
		    
		    prev.next=current.next;
		    
		    
		    return head;
		}
	 /*Given only a pointer/reference to a node to be deleted in a singly linked list, how do you delete it? */
	 public  void deleteNode(ListNode Node_ptr)
     {
		 ListNode temp = Node_ptr.next;
        Node_ptr.data = temp.data;
        Node_ptr.next = temp.next;
        temp = null;
     }

	ListNode InsertNth(ListNode head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
	ListNode current =head;
	ListNode prev=null;
    int length = getListLength(current);
    if(length<position) return head;
    if (position == 0) {
    	ListNode newNode   = new ListNode(data);
      //  newNode.data=data;
        newNode.next = head;
        head = newNode;
        return head;
    }
    for(int i=1;i<position && current!=null;i++){
        prev=current;
        current=current.next;
    }
    ListNode node = new ListNode(data);
   // node.data=data;
    node.next=prev.next;
    prev.next=node;
    
    return head;
}

	int getListLength(ListNode node){
		    int count=0;
		    while(node!=null){
		        count++;
		        node=node.next;
		    }
		    return count;
	}
	
	public static void main(String[] args) {

		NthNodeFromTail list = new NthNodeFromTail();

	    /*Let us create two sorted linked lists to test
	     the above functions. Created lists shall be
	     a: 5->10->15
	     b: 2->3->20*/
	    list.a = new ListNode(1);
	    list.a.next = new ListNode(3);
	    list.a.next.next = new ListNode(5);
	    list.a.next.next.next = new ListNode(7);
	    list.a.next.next.next.next = new ListNode(9);
	//    System.out.println(list.GetNode(a, 2));
	    list.printList(a);
	//    ListNode head =list.InsertNth(a,11,5);
	//    list.printList(head);
	    System.out.println();
	  //  ListNode head1 =list.Delete(a,0);
	    list.deleteNode(a.next.next);
	    System.out.println();
	    list.printList(a);
	    
	}

}
