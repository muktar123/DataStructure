package org.test.ds.binaryTree;

public class SerachElementInBT {
	

		public static boolean isPresent(BinaryTreeNode root, int x) {
			if (root != null) {

				// check if current node has the element we are looking for
				if (root.data == x) {
					return true;
				} else {
					// check if the sub trees
					return isPresent(root.left, x) || isPresent(root.right, x);
				}
			}
			return false;
		}
		public static void main(String[] args) {
			BinaryTreeNode root = new BinaryTreeNode(1);
			root.left = new BinaryTreeNode(2);
			root.right = new BinaryTreeNode(3);
			root.left.left = new BinaryTreeNode(4);
			root.left.right = new BinaryTreeNode(5);

			System.out.println("Does 4 exist in the tree: " + isPresent(root, 4));
			System.out.println("Does 7 exist in the tree: " + isPresent(root, 7));

		}
}
