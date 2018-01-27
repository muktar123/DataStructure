package org.test.ds.binaryTree;

public class BSTSumTreee {
	BinaryTreeNode root;
	public int sumTree(BinaryTreeNode root){
		
		if(root== null) return 0;
		 
		int oldVal= root.data;
		//int left = sumTree(root.left);
	//	int right =sumTree(root.right);
		root.data = sumTree(root.left) + sumTree(root.right);
		return root.data+oldVal;		
	}
	
	public void inOrderPrint(BinaryTreeNode root){
		if(root==null) return;
		
		inOrderPrint(root.left);
		System.out.print(root.data+" ");
		inOrderPrint(root.right);
	}
	 public static void main(String args[]) 
	    {
	        BSTSumTreee tree = new BSTSumTreee();
	  
	        /* Constructing tree given in the above figure */
	        tree.root = new BinaryTreeNode(10);
	        tree.root.left = new BinaryTreeNode(-2);
	        tree.root.right = new BinaryTreeNode(6);
	        tree.root.left.left = new BinaryTreeNode(8);
	        tree.root.left.right = new BinaryTreeNode(-4);
	        tree.root.right.left = new BinaryTreeNode(7);
	        tree.root.right.right = new BinaryTreeNode(5);
	  
	        tree.sumTree(tree.root);
	  
	        // Print inorder traversal of the converted tree to test result 
	        // of toSumTree()
	        System.out.println("Inorder Traversal of the resultant tree is:");
	        tree.inOrderPrint(tree.root);
	    }

}
