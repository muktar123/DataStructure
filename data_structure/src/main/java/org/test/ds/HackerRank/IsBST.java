package org.test.ds.HackerRank;

import org.test.ds.binaryTree.BTIsBST;
import org.test.ds.binaryTree.BinaryTreeNode;

public class IsBST {
	boolean checkBST(BinaryTreeNode root) {
		if (root == null)
			return true;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		if (checkBST1(root, min, max)) {
			return true;
		} else
			return false;

	}

	boolean checkBST1(BinaryTreeNode root, int min, int max) {
		if (root == null)
			return false;
		if ((root.data <= min) || (root.data >= max))
			return false;

		return checkBST1(root.left, min, root.data)
				&& checkBST1(root.right, root.data, max);

	}

	public static void main(String[] args) {
		IsBST i = new IsBST();
		BinaryTreeNode root = new BinaryTreeNode(20);
		root.left = new BinaryTreeNode(10);
		root.right = new BinaryTreeNode(30);
		root.left.left = new BinaryTreeNode(55);
		root.left.right = new BinaryTreeNode(15);
		root.right.left = new BinaryTreeNode(25);
		root.right.right = new BinaryTreeNode(35);
		System.out.println("Tree is "+i.checkBST(root));
	}
}
