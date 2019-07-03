package org.test.LinkedList;

import java.util.PriorityQueue;

public class MergeKLinkedList {
	 public static Node mergeKLists(Node[] lists) {
		        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		        for(Node node: lists){
		            while(node!=null){
		                minHeap.add(node.data);
		                node=node.next;
		            }
		        }
		        Node dummyNode = new Node(-1);
		        Node head = dummyNode;
		        while(!minHeap.isEmpty()){
		            head.next = new Node(minHeap.remove());
		            head = head.next;
		        }
		        return dummyNode.next;
	    }

	 public static Node mergeKListsUsingJava8(Node[] lists) {
	        if (lists==null || lists.length==0) return null;
	        
	        PriorityQueue<Node> queue= new PriorityQueue<Node>(lists.length, (a,b)-> a.data-b.data);
	        
	        Node dummy = new Node(0);
	        Node tail=dummy;
	        
	        for (Node node:lists)
	            if (node!=null)
	                queue.add(node);
	            
	        while (!queue.isEmpty()){
	            tail.next=queue.poll();
	            tail=tail.next;
	            
	            if (tail.next!=null)
	                queue.add(tail.next);
	        }
	        return dummy.next;
	    }
	 public static void printList(Node head)  
	    {  
	        while (head != null) {  
	            System.out.print(head.data+" "); 
	            head = head.next;  
	        }  
	    }  
	
	 public static void main(String[] args) {
		 
		MergeKLinkedList mkl  = new MergeKLinkedList();
		int k = 3; // Number of linked lists  
        int n = 4; // Number of elements in each list  
    
        // an array of pointers storing the head nodes  
        // of the linked lists  
        Node arr[]=new Node[k];  
    
        arr[0] = new Node(1);  
        arr[0].next = new Node(3);  
        arr[0].next.next = new Node(5);  
        arr[0].next.next.next = new Node(7);  
    
        arr[1] = new Node(2);  
        arr[1].next = new Node(4);  
        arr[1].next.next = new Node(6);  
        arr[1].next.next.next = new Node(8);  
    
        arr[2] = new Node(0);  
        arr[2].next = new Node(9);  
        arr[2].next.next = new Node(10);  
        arr[2].next.next.next = new Node(11);  
    
        // Merge all lists  
        Node head = mergeKLists(arr);  
        printList(head);  
     //   Node head = mergeKListsUsingJava8(arr);  
      //  printList(head);  
	}
}
