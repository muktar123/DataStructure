package org.test.ds.linkedlist;



public class CompareTwoLists {

	static ListNode a, b;
	int CompareLists(ListNode headA, ListNode headB) {
	 ListNode current1=headA,current2=headB;
	    if(current1==null && current2==null) return 1;
	    int len1=getListLength(current1);
	    int len2=getListLength(current2);
	    if(len1!=len2) return 0;
	    int x=0;
	    while(current1!=null && current2!=null){
	        if(current1.data==current2.data){
	        	x++;
	            current1=current1.next;
	            current2=current2.next;   
	        
	        }else{
	        	return 0;
	        }
	       
	    }
	    if(x==len1) return 1;
		return 0;
	   
	  
	}
	int getListLength(ListNode node){
	    int count=0;
	    while(node!=null){
	        count++;
	        node=node.next;
	    }
	    return count;
}
	 void printlist(ListNode node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	
	public static void main(String[] args) {
		
	
	CompareTwoLists list = new CompareTwoLists();

    /*Let us create two sorted linked lists to test
     the above functions. Created lists shall be
     a: 5->10->15
     b: 2->3->20*/
    list.a = new ListNode(1);
    list.a.next = new ListNode(3);
    list.a.next.next = new ListNode(5);

    list.b = new ListNode(1);
    list.b.next = new ListNode(3);
    list.b.next.next = new ListNode(5);
 //   list.b.next.next.next = new ListNode(5);

    System.out.println("List a before merge :");
    list.printlist(a);
    System.out.println("");
    System.out.println("List b before merge :");
    list.printlist(b);

    // merge two sorted linkedlist in decreasing order
    System.out.println(list.CompareLists(a, b));
}
}