package org.test.ds.binaryTree;

public class BTIsBST {

	public static boolean isBST(BinaryTreeNode root, int min, int max) {

		if (root != null){
			if (root.data <= min || root.data >= max)
				return false;

		   return isBST(root.left, min, root.data)
				&& isBST(root.right, root.data, max);
	  }else return true;
	}
public static void main(String[] args) {
	BTIsBST i = new BTIsBST();
	BinaryTreeNode root = new BinaryTreeNode(20);
	root.left = new BinaryTreeNode(10);
	root.right = new BinaryTreeNode(30);
	root.left.left = new BinaryTreeNode(55);
	root.left.right = new BinaryTreeNode(15);
	root.right.left = new BinaryTreeNode(25);
	root.right.right = new BinaryTreeNode(35);
	System.out.println("Tree is "+isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
}
}
