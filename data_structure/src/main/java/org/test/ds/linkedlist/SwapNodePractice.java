package org.test.ds.linkedlist;

class Node1 {
	int data;
	Node1 next;

	Node1(int d) {
		this.data = d;
		this.next = null;
	}
}

public class SwapNodePractice {
	Node1 head;

	public void swap(int x, int y) {

		if (x == y)
			return;
		//	get previous link pos
		Node1 prevX = null, currX = head;
		while (currX != null && currX.data != x) {

			prevX = currX;
			currX = currX.next;
		}
//		get previous link pos
		Node1 prevY = null, currY = head;
		while (currY != null && currY.data != y) {

			prevY = currY;
			currY = currY.next;
		}

		if (currX == null || currY == null)
			return;

		if (prevX.next != null) {
			prevX.next = currY;
		} else {
			head = currY;
		}
		
		if (prevY.next != null) {
			prevY.next = currX;
		} else {
			head = currX;
		}
		
		Node1 temp;
		temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
	}


public void push(int new_data)
{
    /* 1. alloc the Node and put the data */
    Node1 new_Node = new Node1(new_data);

    /* 2. Make next of new Node as head */
    new_Node.next = head;

    /* 3. Move the head to point to new Node */
    head = new_Node;
}

/* This function prints contents of linked list starting
   from the given Node */
public void printList()
{
    Node1 tNode = head;
    while (tNode != null)
    {
        System.out.print(tNode.data+" ");
        tNode = tNode.next;
    }
}

/* Druver program to test above function */
public static void main(String[] args)
{
	SwapLinkedList llist = new SwapLinkedList();

    /* The constructed linked list is:
        1->2->3->4->5->6->7 */
    llist.push(7);
    llist.push(6);
    llist.push(5);
    llist.push(4);
    llist.push(3);
    llist.push(2);
    llist.push(1);

    System.out.print("\n Linked list before calling swapNodes() ");
    llist.printList();

    llist.swapNodes(1, 8);

    System.out.print("\n Linked list after calling swapNodes() ");
    llist.printList();
}
}
// This code is contributed by Rajat Mishra
