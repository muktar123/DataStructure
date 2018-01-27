package org.test.ds.binaryTree;

public class MirrorTree {
	
	BinaryTreeNode root ;
	public BinaryTreeNode createMirrorTree(BinaryTreeNode root){
		if(root!=null){
			createMirrorTree(root.left);
			createMirrorTree(root.right);
			BinaryTreeNode temp;
			temp=root.left;
			root.left=root.right;
			root.right=temp;
				
		}
		return root;
	}
	
	//check if two trees are mirror of each other
	public boolean isMirror(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root1==null && root2==null) return true;
		if(root1==null || root2==null) return false;
		if(root1.data!=root2.data) return false;
		else
			return(isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left));
	}
	public void inOrder(BinaryTreeNode node){
		if(node!=null){
			
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
			
		}
	}
	public static void main(String[] args) {
		MirrorTree tree = new MirrorTree();
		
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
		System.out.println(tree.createMirrorTree(tree.root));

		BinaryTreeNode root1 =tree.createMirrorTree(tree.root);
		System.out.println("Traverse afer Mirror change");
		tree.inOrder(root1);
}
}