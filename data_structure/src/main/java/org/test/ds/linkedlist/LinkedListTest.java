package org.test.ds.linkedlist;


public class LinkedListTest {
	
	static ListNode head;
	private int length=0;
	public int listLength(ListNode head){
		ListNode ln = head;
		
		
		while(ln!=null){
			length++;
			ln=ln.getNext();
		}
		return length;
	}
	
	public void insertAtBegin(ListNode first){
		first.setNext(head);
		head=first;
		length++;
		
	}
	
	public void insertAtEnd(ListNode endNode){
		if(head == null){
			head= endNode;					
		} else{
			ListNode p=head,q;
			while(p.getNext()!=null){
				 p= p.getNext();
				
			}
		//	ListNode list = new ListNode(5);
			p.setNext(endNode);
			length++;
		}
		

		}
	
	public boolean isCylicTest(ListNode head){
		ListNode firstPtr =head;
		ListNode secondPtr =head;
		while(firstPtr!= null && firstPtr.getNext()!=null){
			firstPtr = firstPtr.getNext().getNext();
			secondPtr= secondPtr.getNext();
			if(firstPtr == secondPtr) return true;
			return false; 		
		}
		return false;
		
	}

	public void disp(){
		ListNode current=head;
		while(current!= null){
			System.out.println(current.getData());
			current = current.getNext();
			
		}
	}
		/*ListNode reverseLinkedList(ListNode node) {  
		     if (node == null || node.getNext() == null) {  
		         return node;  
		     }  
		  
		     ListNode remaining = reverseLinkedList(node.getNext());  
		     node.getNext().getNext() = node;  
		     node.next = null;  
		    return remaining;  
		 }  
*/
		
	public ListNode NthNodeFromEnd(ListNode head, int nth){
		int counter=0;
		if(head!=null){
			NthNodeFromEnd(head.getNext(),  nth);
			counter++;
			if(nth==counter){
				return head;
			}
		}

		return null;
	}
	
	//Linked list length is even or odd without using length
	public int lengthEvenOrOdd(ListNode head){
		ListNode current = head;
		while(current!=null){
			current =current.next.next;
		}
		if(current==null) return 0;
		else return current.data;
		
	}

	public static void main(String[] args) {
		LinkedListTest list= new LinkedListTest();
		head = new ListNode(1);
		ListNode lnn=null;
		 head.next=  new ListNode(5);
		 head.next.next=  new ListNode(15);
		 head.next.next.next=  new ListNode(25);
		// head.next.next.next.next=  new ListNode(7);
	//	ListNode ln3=  new ListNode(15);
		System.out.println(list.lengthEvenOrOdd(head));
	//	list.insertAtBegin(ln);
		//list.insertAtBegin(ln1);
	//	list.insertAtBegin(ln2);
	//	list.insertAtBegin(ln1);
		//list.insertAtEnd(lend);
	//	list.isCylicTest(ln1);
	//	list.disp();
	//	System.out.println(list.NthNodeFromEnd(ln, 2));
		//list.insertAtBegin(first);
	}
}
