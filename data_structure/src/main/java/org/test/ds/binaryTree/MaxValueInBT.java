package org.test.ds.binaryTree;

public class MaxValueInBT {
	private BinaryTreeNode root;
	public int getMaxNode(BinaryTreeNode root){
		int max = Integer.MIN_VALUE;
		int left,right;
		BinaryTreeNode curr = root;
		if(root==null) return 0;
		max=curr.data;
		 left = getMaxNode(curr.left);
		 right =getMaxNode(curr.right);
		if(left>max) max=left;
		if(right>max) max=right;
		return max;
	//	return left.data>right.data ? left :right;
		
		
	}
	private void preorder(BinaryTreeNode r)  {
        if (r != null)        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }

	public static void main(String[] args) {
		MaxValueInBT bc = new MaxValueInBT();
		bc.root = new BinaryTreeNode(20);
		bc.root.left = new BinaryTreeNode(8);
		bc.root.right = new BinaryTreeNode(22);
		bc.root.left.left = new BinaryTreeNode(4);
		bc.root.left.right = new BinaryTreeNode(12);
		bc.root.left.right.left = new BinaryTreeNode(10);
		bc.root.left.right.right = new BinaryTreeNode(14);
		bc.preorder(bc.root);
		System.out.println("----"+bc.getMaxNode(bc.root));
	}

}
