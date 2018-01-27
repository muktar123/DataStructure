package org.test.ds.binaryTree;

public class BSTGreaterSumTree {
		public static int sum = 0;
		public void greaterTree(BinaryTreeNode root){
			if(root!=null){
				//visit the right node first
				greaterTree(root.right);
				//store the node value in temp
				int temp = root.data;
				//update the sum, sum till previous visited node
				root.data = sum;
				//update the sum for the next node
				sum = sum + temp;
				greaterTree(root.left);			
			}else return;
		}
		public void inorder(BinaryTreeNode root){
			if(root!=null){
				inorder(root.left);
				System.out.print("  " + root.data);
				inorder(root.right);
			}
		}
		public static void main(String args[]){

			BinaryTreeNode root = new BinaryTreeNode(10);
			root.left = new BinaryTreeNode(5);
			root.right = new BinaryTreeNode(15);
			root.left.left = new BinaryTreeNode(2);
			root.left.right = new BinaryTreeNode(7);
			root.right.left = new BinaryTreeNode(12);
			root.right.right = new BinaryTreeNode(20);

			BSTGreaterSumTree b = new BSTGreaterSumTree();
			b.inorder(root);
			System.out.println("");
			b.greaterTree(root);
			b.inorder(root);
			
		}
	}