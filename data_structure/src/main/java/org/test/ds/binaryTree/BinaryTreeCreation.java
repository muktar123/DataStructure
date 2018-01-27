package org.test.ds.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeCreation {
	BinaryTreeNode root; 
	static int sum=0;
	public void insertNode(BinaryTreeNode node, int data) {
		if (node.data > data) {
			if (node.left != null) {
				insertNode(node.left, data);
			} else {
				System.out.println("  Inserted " + data + " to left of "
						+ node.data);
				node.left = new BinaryTreeNode(data);
			}
		} else if (data > node.data) {
			if (node.right != null) {
				insertNode(node.right, data);
			} else {
				System.out.println("  Inserted " + data + " to right of "
						+ node.data);
				node.right = new BinaryTreeNode(data);
			}
		}
	}
	
	public void inOrder(BinaryTreeNode node){
		List<Integer> l = new ArrayList<Integer>();
		int k=0;
		if(node!=null){
			inOrder(node.left);
			System.out.print(node.data+" ");
			l.add(node.data);
			inOrder(node.right);			
		}
		
		
	
	
		//System.out.println("sum is "+sum);
	}
	public void postOrder(BinaryTreeNode node){
		if(node!=null){
			inOrder(node.left);
			inOrder(node.right);
			System.out.print(node.data+" ");
			
			
		}
	}
	private void preorder(BinaryTreeNode r)  {
        if (r != null)        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
	
	public ArrayList<Integer> preOrdertraversalWithoutrecursion(BinaryTreeNode root){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root==null) return res;
		Stack<BinaryTreeNode> s  = new Stack<BinaryTreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode tmp = s.pop();
			res.add(tmp.data);
			if(tmp.right!=null) s.push(tmp.right);
			if(tmp.left!=null) s.push(tmp.left);
		}
		return res;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(5);
		BinaryTreeCreation bc = new BinaryTreeCreation();
	    System.out.println("Binary Tree Example");
	    System.out.println("Building tree with root value " + root.data);
/*	    bc.insertNode(root,1);
	    bc.insertNode(root, 8);
	    bc.insertNode(root, 6);
	    bc.insertNode(root, 3);
	    bc.insertNode(root, 9);*/
	    bc.root = new BinaryTreeNode(20);
		bc.root.left = new BinaryTreeNode(8);
		bc.root.right = new BinaryTreeNode(22);
		bc.root.left.left = new BinaryTreeNode(4);
		bc.root.left.right = new BinaryTreeNode(12);
		bc.root.left.right.left = new BinaryTreeNode(10);
		bc.root.left.right.right = new BinaryTreeNode(14);
	    System.out.println("Traversing tree in order");
	    bc.inOrder(bc.root);
	    System.out.println();
	    System.out.println("Traversing tree pre order");
	    bc.preorder(bc.root);
	    System.out.println();
	    System.out.println("Traversing tree post order");
	    bc.postOrder(bc.root);
	    System.out.println();
	    System.out.println("sum is :"+sum);
	  // System.out.println(bc.preOrdertraversalWithoutrecursion(bc.root));
	}

}