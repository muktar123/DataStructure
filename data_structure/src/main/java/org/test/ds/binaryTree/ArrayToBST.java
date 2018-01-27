package org.test.ds.binaryTree;

public class ArrayToBST {
	
	public BinaryTreeNode sortedArrayToBST(int[] arr){
		if(arr.length == 0) return null;
		int n=arr.length;
		
		return sortedArrayToBSTCal(arr,0,n-1);
		
	}	

	private BinaryTreeNode sortedArrayToBSTCal(int[] arr, int start, int end) {
		if(start>end) return null;
		 int mid= (start+end)/2;
		BinaryTreeNode root = new BinaryTreeNode(arr[mid]);
		
		root.left = sortedArrayToBSTCal(arr, start,mid-1);
		root.right = sortedArrayToBSTCal(arr, mid+1, end);
		
		return root;
	}
	public void preOrderPrint(BinaryTreeNode root){
		if(root==null) return;
		System.out.print(root.data+" ");
		preOrderPrint(root.left);		
		preOrderPrint(root.right);
	} 

	public static void main(String[] args) {
		ArrayToBST lot = new ArrayToBST();
		int[] arr= {1,2,4,5,6,7,9};
		BinaryTreeNode root =lot.sortedArrayToBST(arr);
		System.out.println("In order traversal ");
		lot.preOrderPrint(root);
	}
}
