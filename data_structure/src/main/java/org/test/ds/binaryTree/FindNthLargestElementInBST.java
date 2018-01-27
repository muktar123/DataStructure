package org.test.ds.binaryTree;

public class FindNthLargestElementInBST {
	BinaryTreeNode root;

	public BinaryTreeNode getNthLargest(BinaryTreeNode root, int n, int count){
		if(root==null) return null;
		
		
		BinaryTreeNode left=getNthLargest(root.left,n,count);
		if(left!=null)
			return left;
			if(++count==n)
				return root;
		
		return getNthLargest(root.right,n,count);
	//	return nthLargest;
		
	}
	public static void main(String[] args) {
		FindNthLargestElementInBST tree = new FindNthLargestElementInBST();
	//	BinaryTreeNode root = new BinaryTreeNode(6);

		tree.root = new BinaryTreeNode(5);
		tree.root.left = new BinaryTreeNode(3);
		tree.root.right = new BinaryTreeNode(6);
		tree.root.left.left = new BinaryTreeNode(2);
		tree.root.left.right = new BinaryTreeNode(1);
		tree.root.right.left = new BinaryTreeNode(4);
		tree.root.right.right = new BinaryTreeNode(7);
		int[] arr = new int[8];
		BinaryTreeNode bbt =tree.getNthLargest(tree.root, 4, 0);
		System.out.println(bbt.data);
	}

}
