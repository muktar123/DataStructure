package org.test.ds.linkedlist;

public class MergeLinkedListRecursive {
	
	static ListNode head;
	public ListNode mergeList(ListNode head1, ListNode head2){
		 if(head1== null) return head2;
		 if(head2==null) return head1;
		 ListNode head= new ListNode(0);
		 if(head1.data<head2.data){
			 head.next=head1;
			head.next= mergeList(head1.next,head2);
			
		 }else{
			 head.next=head2;
				head.next =mergeList(head2.next,head1);
				
		 }
		 return head;
	}
	int GetNode(ListNode head,int n) {	
		ListNode current =head;
    int cnt=0;
    while(current!=null){
        cnt++;
        System.out.println(cnt+"....");
        current=current.next;
    }
    ListNode temp =head;
    if(cnt<n) return 0;
   
    for(int i=1;i<cnt-n+1;i++){
        temp=temp.next;
    }
    return temp.data;
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
		
		MergeLinkedListRecursive mrl = new MergeLinkedListRecursive();
		ListNode n1 = new ListNode(1);
		ListNode n3 = new ListNode(3);
		ListNode n5 = new ListNode(5);
		ListNode n7 = new ListNode(7);
		ListNode n9 = new ListNode(9);

        n1.next = n3;
        n3.next = n5;
        n5.next = n7;
        n7.next = n9;
        n9.next = null;

        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n6 = new ListNode(6);
        ListNode n8 = new ListNode(8);
        ListNode n10 = new ListNode(10);

        n2.next = n4;
        n4.next = n6;
        n6.next = n8;
        n8.next = n10;
        n10.next = null;
        ListNode head1= mrl.mergeList(n1, n2);
//System.out.println(head1.data);
       // System.out.println("Merge : " + );
//System.out.println(mrl.GetNode(n2, 1));
		mrl.display(head1);
		//mrl.display(head1);
		
	}

}
