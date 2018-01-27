package org.test.ds.binaryTree;

public class MaxValueInBinaryTree {
	BinaryTreeNode root;
	public int maxInBinaryTree(BinaryTreeNode root){
		int maxValue = Integer.MIN_VALUE;
		if(root!=null){
			int leftMax = maxInBinaryTree(root.left);
			int rightMax = maxInBinaryTree(root.right);
			if(leftMax>rightMax)
				maxValue =leftMax;
			else
				maxValue = rightMax;
		
		if(root.data>maxValue)
			maxValue =root.data;
	}
		return maxValue;
	}
	public int maxInBinaryTreeRecursive(BinaryTreeNode root){
			if (root != null) {
				return max(root.data, maxInBinaryTreeRecursive(root.left), maxInBinaryTreeRecursive(root.right));
			}
			return 0;
		}

		public int max(int a, int b, int c) {
			return (Math.max(a, Math.max(b, c)));
		}
	
	public static void main(String[] args) {
		MaxValueInBinaryTree tree = new MaxValueInBinaryTree();
		BinaryTreeNode root = new BinaryTreeNode();
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(2);
		tree.root.right = new BinaryTreeNode(3);
		tree.root.left.left = new BinaryTreeNode(14);
		tree.root.left.right = new BinaryTreeNode(5);
		System.out.println(tree.maxInBinaryTree(tree.root));
		System.out.println(tree.maxInBinaryTreeRecursive(tree.root));
	}
	
}
