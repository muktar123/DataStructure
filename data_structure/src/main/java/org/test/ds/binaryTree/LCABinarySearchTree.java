package org.test.ds.binaryTree;

public class LCABinarySearchTree {
	BinaryTreeNode root;
	public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {
	    if (root == null || a == null || b == null) {
	        return null;
	    }
	    
	    if (Math.max(a.data, b.data) < root.data) { 
	        // both nodes are on the left
	        return lowestCommonAncestor(root.left, a, b);    
	    } else 
	    if (Math.min(a.data, b.data) > root.data) {
	        // both nodes are on the right
	        return lowestCommonAncestor(root.right, a, b);    
	    } else {
	        // the nodes are on separate branches
	        return root;        
	    }
	}
	public static void main(String[] args) {
		LCABinarySearchTree tree = new LCABinarySearchTree();
	//	BinaryTreeNode root = new BinaryTreeNode(6);
		tree.root = new BinaryTreeNode(5);
		tree.root.left = new BinaryTreeNode(3);
		tree.root.right = new BinaryTreeNode(6);
		tree.root.left.left = new BinaryTreeNode(2);
		tree.root.left.right = new BinaryTreeNode(1);
		tree.root.right.left = new BinaryTreeNode(4);
		tree.root.right.right = new BinaryTreeNode(7);
		System.out.println("In order traversal ");
		//lot.inOrder(root);
		//System.out.println();
		System.out.println("Level order traversal ");
		BinaryTreeNode bt =lowestCommonAncestor(tree.root, tree.root.left.left, tree.root.right.right);
		System.out.println(bt.data);
}
}