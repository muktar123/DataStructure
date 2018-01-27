package org.test.ds.linkedlist;

import org.test.ds.binaryTree.BinaryTreeNode;

public class SortedLinkedListToBST {


		public static Node head = null;
		public BinaryTreeNode LLToBST(int start, int end){
			if(start>end)return null;
			int mid = (start+end)/2;
			BinaryTreeNode leftChild = LLToBST(start,mid-1);
			BinaryTreeNode root = new BinaryTreeNode(head.data);
			root.left = leftChild;
			head = head.next;
			root.right = LLToBST(mid+1,end);
			return root;
		}
		public int getSize(){
			Node curr = head;
			int size =0;
			while(curr!=null){
				curr=curr.next;
				size++;
			}
			return size;
		}
		public void inorder(BinaryTreeNode root){
			if(root!=null){
				inorder(root.left);
				System.out.print(" " + root.data);
				inorder(root.right);
			}
		}
		public void preorder(BinaryTreeNode root){
			if(root!=null){
				System.out.print(" " + root.data);
				inorder(root.left);
				
				inorder(root.right);
			}
		}
		public static void main (String[] args) throws java.lang.Exception
		{
			head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			head.next.next.next = new Node(4);
			head.next.next.next.next = new Node(5);
			Node tail = new Node(6);
			head.next.next.next.next.next = tail;

			SortedLinkedListToBST i = new SortedLinkedListToBST();
			BinaryTreeNode x = i.LLToBST(1,i.getSize()) ;
			System.out.print("Constructed BST is :");
			i.inorder(x);
			System.out.println();
			i.preorder(x);

		}
	}
