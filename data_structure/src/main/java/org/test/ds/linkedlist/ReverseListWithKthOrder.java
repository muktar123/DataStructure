package org.test.ds.linkedlist;

public class ReverseListWithKthOrder {

	   public ReverseListWithKthOrder()
	    {
	    }
	 
	    public ListNode reverseKListNodes(ListNode headerNode, int k)
	    {
	        // Take 3 pointers startNode, endNode, nextNode pointing to headerNode
	        ListNode nextNode = headerNode;
	        ListNode startNode = null;
	        ListNode endNode = null;
	        headerNode = null;
	 
	        while (nextNode != null)
	        {
	            //  startNode and endNode points to nextNode
	            startNode = nextNode;
	            endNode = nextNode;
	 
	            //  Move endNode pointing towards node after k elements from startNode
	            for (int i = 1; i < k; i++)
	            {
	                endNode = endNode.next;
	 
	                if (endNode == null)
	                {
	                    break;
	                }
	            }
	 
	            // If endNode is not null, then reverse the list starting from startNode to endNode
	            // eles if endNode is null, then there is nothing to reverse
	 
	            if (endNode != null)
	            {
	                // Save the node next to endNode
	                nextNode = endNode.next;
	 
	                //  Unlink the endNode
	                endNode.next = null;
	 
	                // Reverse the list starting from startNode
	                ListNode previousNode=null;  
	                ListNode nextNode1; 
	                while(startNode!=null)  
	                {  nextNode1=startNode.next;  
	                // reversing the link  
	                 startNode.next=previousNode;  
	                // moving currentNode and previousNode by 1 node  
	                 previousNode=startNode;  
	                 startNode=nextNode1;  
	                }  

	            }
	            else
	            {
	                nextNode = null;
	            }
	 
	            //  Point headerNode to the startNode of the first iteration.
	            //  If the headerNode is set, append the list startNode to the headerNode
	            if (headerNode == null)
	            {
	                headerNode = startNode;
	            }
	            else
	            {
	                SingleLinkedList.getLastNode(headerNode).next = startNode;
	            }
	        }
	 
	        return headerNode;
	    }
	 
	    public static void main(String[] args)
	    {
	        /*  Constructing Single Linked List:
	            1 -> 2 ->3 -> 4 ->5 */
	        ReverseListWithKthOrder newList = new ReverseListWithKthOrder();
	        newList.add(1);
	        newList.add(2);
	        newList.add(3);
	        newList.add(4);
	        newList.add(5);
	 
	        System.out.println("List before reversal");
	        newList.printList();
	 
	        ListNode headerNode = newList.getList();
	 
	        KReverseList kRevList = new KReverseList();
	        headerNode = kRevList.reverseKListNodes(headerNode, 2);
	        newList.setList(headerNode);
	 
	        System.out.println("List after reversal");
	        newList.printList();
	    }
	}