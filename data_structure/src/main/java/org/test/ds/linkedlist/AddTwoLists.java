package org.test.ds.linkedlist;


public class AddTwoLists {
	static ListNode a, b;
	 public int getLength(ListNode head){
	        int len=0;
	        while(head!=null){
	            len++;
	            head = head.next;
	        }
	        return len;
	    }
	public ListNode addTwoLists(ListNode l1,ListNode l2){
		ListNode dummyHead = new ListNode(0);
		ListNode curr1=l1,curr2=l2,curr=dummyHead;
		int carry=0;
		
		while(curr1 != null || curr2 != null){
	            if(curr1 != null){
	                carry += curr1.data;
	                curr1 = curr1.next;
	            }
	 
	            if(curr2 != null){
	                carry += curr2.data;
	                curr2 = curr2.next;
	            }
	 
	            curr.next = new ListNode(carry%10);
	            curr = curr.next;
	            carry /= 10;
	        }
	 
	        if(carry==1) 
	            curr.next=new ListNode(1);
	 
	        return dummyHead.next;
	        /*		while(curr1!=null && curr2!=null){
			int x = curr1!=null?curr1.data:null;
			int y = curr2!=null?curr2.data:null;
			int sum = x+y+carry;
			carry = sum/10;
			sum =sum%10;
			curr.next=new ListNode(sum);
			curr=curr.next;
			if(curr1!=null) curr1=curr1.next;
			if(curr2!=null) curr2=curr2.next;
		}
		if(carry>0) curr.next=new ListNode(carry);
		return dummyHead.next;*/
	    }
		
	
	public static void main(String[] args) {
		AddTwoLists list = new AddTwoLists();
		list.a = new ListNode(1);
	    list.a.next = new ListNode(3);
	    list.a.next.next = new ListNode(5);
	    list.a.next.next.next = new ListNode(9);
	 //   list.a.next.next.next.next = new ListNode(2);

	    list.b = new ListNode(2);
	    list.b.next = new ListNode(4);
	    list.b.next.next = new ListNode(6);
	    ListNode newHead =list.addTwoLists(a, b);
	    list.printIterative(newHead);
	    System.out.println();
	    list.print(newHead);
	}
	private void printIterative(ListNode newHead){
		while(newHead!=null){
			System.out.print(newHead.data);
			newHead= newHead.next;
		}
	}
			private void print(ListNode newHead) {
		if(newHead!=null){
			print(newHead.next);
			System.out.print(newHead.data);
			//newHead=newHead.next;
			
	}
		
	}

}
