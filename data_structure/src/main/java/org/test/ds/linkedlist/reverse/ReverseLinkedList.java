package org.test.ds.linkedlist.reverse;

public class ReverseLinkedList {
	 private Node head;  
	  
	 private static class Node {  
	  private int value;  
	  private Node next;  
	  
	  Node(int value) {  
	   this.value = value;  
	  
	  }  
	 }  
	  
	 public void addToTheLast(Node node) {  
	  
	  if (head == null) {  
	   head = node;  
	  } else {  
	   Node temp = head;  
	   while (temp.next != null)  
	    temp = temp.next;  
	  
	   temp.next = node;  
	  }  
	 }  
	  
	  
	 public void printList(Node head) {  
	  Node temp = head;  
	  while (temp != null) {  
	   System.out.format("%d ", temp.value);  
	   temp = temp.next;  
	  }  
	  System.out.println();  
	 } 
	 
	 public void printListReverse(Node head) {  
		   Node temp = null;
		  while (temp != null) {  
		   System.out.format("%d ", temp.value);  
		   temp = temp.next;  
		  }  
		  System.out.println();  
		 }  
		 
	  
	 // Reverse linkedlist using this function   
	public static Node reverseLinkedList(Node currentNode)  
	 {  
	// For first node, previousNode will be null  
	Node previousNode=null;  
	  Node nextNode;  
	  while(currentNode!=null)  
	  {  
		  //hold the current node link
	   nextNode=currentNode.next;  
	  // reversing the link  
	   currentNode.next=previousNode;  
	  // moving currentNode and previousNode by 1 node  
	   previousNode=currentNode;  
	   currentNode=nextNode;  
	  }  
	  return previousNode;  
	 }  
//https://www.youtube.com/watch?v=sYcOK51hl-A good explanation	
	
	public static Node reverseLinkedListRecursive(Node node) {  
	     if (node == null || node.next == null) {  
	         return node;  
	     }  
	  
	     Node remaining = reverseLinkedListRecursive(node.next);  
	     node.next.next = node;  
	     node.next = null;  
	    return remaining;  
	 }  

	
	 public static void main(String[] args) {  
		 ReverseLinkedList list = new ReverseLinkedList();  
	  // Creating a linked list  
	  Node head=new Node(5);  
	  list.addToTheLast(head);  
	  list.addToTheLast(new Node(6));  
	  list.addToTheLast(new Node(7));  
	  list.addToTheLast(new Node(1));  
	  list.addToTheLast(new Node(2));  
	   
	  list.printList(head);  
	  //Reversing LinkedList  
	//  Node reverseHead=reverseLinkedList(head);  
	  Node reverseHead=reverseLinkedListRecursive(head);
	  
	  System.out.println("After reversing");  
	  list.printList(reverseHead);  
	   
	 }  
	  
	}  

	


