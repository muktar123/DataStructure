package org.test.ds.linkedlist;

public class SortedDLLToBST {
	public static DLList head = null;
	public static DLList tail = null;
	public static DLList prev = null;
	public static int size = 0;
	public DLList root;

	public void add(int data) {
		DLList n = new DLList(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			head.prev = n;
			n.next = head;
			head = n;
		}
		size++;
	}
	public DLList dLLtoBST(int size) {
		if (size <= 0) {
			return null;
		}
		DLList left = dLLtoBST(size / 2);
		DLList root = head;
		root.prev = left;
		head = head.next;
		root.next = dLLtoBST(size-(size / 2)-1);
		return root;
	}

	public void inOrder(DLList root) {
		if (root != null) {
			inOrder(root.prev);
			System.out.print(" " + root.data);
			inOrder(root.next);
		}
	}

	public void printDLL(DLList head) {
		DLList curr = head;
		while (curr != null) {
			System.out.print(" " + curr.data);
			curr = curr.next;
		}
}
	public static void main(String[] args) {
		SortedDLLToBST r = new SortedDLLToBST();
		r.add(9);
		r.add(8);
		r.add(7);
		r.add(6);
		r.add(5);
		r.add(4);
		r.add(3);
		r.add(2);
		r.add(1);
		DLList h = head;
		System.out.println("DLL is : ");
		r.printDLL(h);
		System.out.println();
		DLList x = r.dLLtoBST(size);
		System.out.println("Inorder traversal of contructed BST");
		r.inOrder(x);
	}
}
