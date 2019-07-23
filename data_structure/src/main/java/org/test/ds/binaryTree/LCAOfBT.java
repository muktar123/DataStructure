package org.test.bt;

public class LCAOfBT {
	
	public static BTree getLCA(BTree root, int n1, int n2) {
		
		if(root == null) return null;
		 
		if(root.data == n1 || root.data == n2) {
			return root;
		}
		
		BTree left = getLCA(root.left, n1, n2);
		BTree right = getLCA(root.right, n1, n2);
		
		if(left!=null && right!=null) {
			return root;
		}
		
		return left!=null ? left : right;

	}
	public static void main(String[] args) {
		BTree root = new BTree(1);
		root.left = new BTree(2);
		root.right = new BTree(3);
		root.left.left = new BTree(4);
		root.left.right = new BTree(5);
		root.right.left = new BTree(6);
		root.right.right = new BTree(7);
		System.out.println(getLCA(root, 2, 8).data);
	}

}
