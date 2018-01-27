package org.test.ds.linkedlist;

public class MergeInReverseOrder {

	// Java program to merge two sorted linked list such that merged 
	// list is in reverse order
	 
	// Linked List Class
	 
	    ListNode head;  // head of list
	    static ListNode a, b;
	 
	    /* Node Class */
	    static class static  {
	 
	        int data;
	        ListNode next;
	 
	        // Constructor to create a new node
	        ListNode(int d) {
	            data = d;
	            next = null;
	        }
	    }
	 
	    void printlist(ListNode node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 	    ListNode sortedmerge(ListNode node1, ListNode node2) {
	        // if both the nodes are null
	        if (node1 == null && node2 == null) {
	            return null;
	        }
	        // resultant node
	        ListNode res = null;
	        // if both of them have nodes present traverse them
	        while (node1 != null && node2 != null) {
	 
	            // Now compare both nodes current data
	            if (node1.data <= node2.data) {
	                ListNode temp = node1.next;
	                node1.next = res;
	                res = node1;
	                node1 = temp;
	            } else {
	                ListNode temp = node2.next;
	                node2.next = res;
	                res = node2;
	                node2 = temp;
	            }
	        }
	 
	        // If second list reached end, but first list has
	        // nodes. Add remaining nodes of first list at the
	        // front of result list
	        while (node1 != null) {
	            ListNode temp = node1.next;
	            node1.next = res;
	            res = node1;
	            node1 = temp;
	        }
	 
	        // If first list reached end, but second list has
	        // node. Add remaining nodes of first list at the
	        // front of result list
	        while (node2 != null) {
	            ListNode temp = node2.next;
	            node2.next = res;
	            res = node2;
	            node2 = temp;
	        }
	 
	        return res;
	 
	    }
	 
	    public static void main(String[] args) {
	 
	        MergeInReverseOrder list = new MergeInReverseOrder();
	        ListNode result = null;
	 
	        /*Let us create two sorted linked lists to test
	         the above functions. Created lists shall be
	         a: 5->10->15
	         b: 2->3->20*/
	        list.a = new ListNode(1);
	        list.a.next = new ListNode(3);
	        list.a.next.next = new ListNode(5);
	 
	        list.b = new ListNode(2);
	        list.b.next = new ListNode(4);
	        list.b.next.next = new ListNode(6);
	 
	        System.out.println("List a before merge :");
	        list.printlist(a);
	        System.out.println("");
	        System.out.println("List b before merge :");
	        list.printlist(b);
	 
	        // merge two sorted linkedlist in decreasing order
	        result = list.sortedmerge(a, b);
	        System.out.println("");
	        System.out.println("Merged linked list : ");
	        list.printlist(result);
	 
	    }
	}
	 
	// This code has been contributed by Mayank Jaiswal
