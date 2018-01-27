package org.test.ds.linkedlist;

public class MergeLinkedListIterative {
	
	public static ListNode head1;
	public static ListNode head2;
	static ListNode head;
	public ListNode mergeList(ListNode head1, ListNode head2){
		ListNode head= new ListNode(0);
		ListNode current=head;
		while(head1!=null && head2 !=null){ 
			if(head1.data<=head2.data){
				current.next=head1;
				head1=head1.next;
			}else{
				current.next=head2;
				head2=head2.next;
			}
			current=current.next;
		}
			if(head1!=null){
				current.next=head1;
			//	head1=head1.next;
			}
			if(head2!=null) {
				current.next=head2;
			//	head2=head2.next;
			}
			
			
		
		return head.next;
	}
	
	public void insertFirst(ListNode first){
		
		first.next = head;
		head= first;
	}
	

	
	public void display(ListNode head){
		ListNode current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	@Override
    public String toString() {
		ListNode cur = head;
        String str = "";

        while(cur != null) {
            str += cur.data+"->";
            cur = cur.next;
        }

        return str;
    }
	
	public static void main(String[] args) {
		
		MergeLinkedListIterative list = new MergeLinkedListIterative();
		 // creating first linked list
        list.head1 = new ListNode(33);
        list.head1.next = new ListNode(66);
        list.head1.next.next = new ListNode(99);
        list.head1.next.next.next = new ListNode(200);
        list.head1.next.next.next.next = new ListNode(330);
        list.head1.next.next.next.next = new ListNode(400);
 
        // creating second linked list
        list.head2 = new ListNode(10);
        list.head2.next = new ListNode(50);
        list.head2.next.next = new ListNode(500);
        ListNode head= list.mergeList(head1, head2);

       // System.out.println("Merge : " + );

	//	mlr.display(head);
		list.display(head);
		
	}



}
