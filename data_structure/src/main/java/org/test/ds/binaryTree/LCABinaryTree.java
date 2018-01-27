package org.test.ds.binaryTree;

public class LCABinaryTree {
	BinaryTreeNode root ;
	public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {
	    if (root == null) {
	        return null;
	    }
	    
	    if (root.equals(a) || root.equals(b)) { 
	        // if at least one matched, no need to continue
	        // this is the LCA for this root
	        return root;
	    }

	    BinaryTreeNode l = lowestCommonAncestor(root.left, a, b);
	    BinaryTreeNode r = lowestCommonAncestor(root.right, a, b);

	    if (l != null && r != null) {
	    	return root;  // nodes are each on a seaparate branch
	    }

	    // either one node is on one branch, 
	    // or none was found in any of the branches
	    return l != null ? l : r;
	}
	public static void main(String[] args) {
		LCABinaryTree tree = new LCABinaryTree();
		BinaryTreeNode root = new BinaryTreeNode(6);
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(2);
		tree.root.right = new BinaryTreeNode(3);
		tree.root.left.left = new BinaryTreeNode(4);
		tree.root.left.right = new BinaryTreeNode(5);
		tree.root.right.left = new BinaryTreeNode(6);
		tree.root.right.right = new BinaryTreeNode(7);
		System.out.println("In order traversal ");
		//lot.inOrder(root);
		//System.out.println();
		System.out.println("Level order traversal ");
		BinaryTreeNode bt =lowestCommonAncestor(tree.root, tree.root.left.left, tree.root.left.right);
		System.out.println(bt.data);
	}
}

