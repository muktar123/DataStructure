package org.test.ds.binaryTree;

public class FullNodes {

	public void FindFullNodes(BinaryTreeNode root) {
		// do the traversal and print all the nodes which has left and right
		// child
		if (root != null) {
			
			if (root.left != null && root.right != null) {
				System.out.print(root.data + " ");
			}
			FindFullNodes(root.left);
			FindFullNodes(root.right);
			
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.left = new BinaryTreeNode(2);
		root.right = new BinaryTreeNode(3);
		root.left.left = new BinaryTreeNode(4);
		root.left.right = new BinaryTreeNode(5);
		root.left.left.right = new BinaryTreeNode(8);

		FullNodes f = new FullNodes();
		System.out.print("Full Nodes are ");
		f.FindFullNodes(root);
	}
}
