package org.test.ds.binaryTree;

public class DiameterOfBinarayTree {
	
	BinaryTreeNode root;
	public int height(BinaryTreeNode root){
		
		if(root==null) return 0;
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		return 1+ Math.max(lHeight, rHeight);
	}

	public int diameterOfTree(BinaryTreeNode root){
	if(root==null) return 0;
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		int lDiameter = diameterOfTree(root.left);
		int rDiameter = diameterOfTree(root.right);
		
		//return Math.max(lHeight+rHeight+1,Math.max(lDiameter, rDiameter));
		return Math.max(lHeight+rHeight+1,Math.max(lDiameter, rDiameter));
	}
	public void inOrder(BinaryTreeNode node){
		if(node!=null){
			
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
			
		}
	}
	public int sumOfAllNodes(BinaryTreeNode root){
		int sum=0;
		if(root==null) return 0;
		else
			return root.data+sumOfAllNodes(root.left)+sumOfAllNodes(root.right);
	/*	sum+=sumOfAllNodes(root.left);
		sum=sum+root.data;
		sum+=sumOfAllNodes(root.right);
		return sum;*/
		//return 
		
	}
	public static void main(String[] args) {
		DiameterOfBinarayTree tree = new DiameterOfBinarayTree();
		BinaryTreeNode root = new BinaryTreeNode();
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(2);
		tree.root.right = new BinaryTreeNode(3);
		tree.root.left.left = new BinaryTreeNode(4);
		tree.root.left.right = new BinaryTreeNode(5);
		tree.root.right.left = new BinaryTreeNode(6);
		tree.root.right.right = new BinaryTreeNode(7);
	//	tree.root.left.left.left = new BinaryTreeNode(8);
		System.out.println("In order traversal ");
		tree.inOrder(tree.root);
		System.out.println();
		System.out.println(tree.diameterOfTree(tree.root));
		System.out.println("Sum Of All Nodes");
		System.out.println(tree.sumOfAllNodes(tree.root));
}
}