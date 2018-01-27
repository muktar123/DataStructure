package org.test.ds.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalIterative {
	BinaryTreeNode root;

	public void insert(BinaryTreeNode root, int data) {
		if (root.data > data) {
			if (root.left != null) {
				insert(root.left, data);
			} else {
				System.out
						.println("Inserted " + data + " left of " + root.data);
				root.left = new BinaryTreeNode(data);
			}
		} else if (root.data < data) {
			if (root.right != null) {
				insert(root.right, data);
			} else {
				System.out.println("Inserted " + data + " right of "
						+ root.data);
				root.right = new BinaryTreeNode(data);
			}
		}
	}

	
//in order traversal always give in sorted order for BST
	public void inOrderIterative(BinaryTreeNode root) {
		List<Integer> l=  new LinkedList<Integer>();
		int sum=0;
		if (root == null)
			return;
		
		BinaryTreeNode node = root;
		int k=0;
		Stack<BinaryTreeNode> nodeStack = new Stack<BinaryTreeNode>();
		while (node != null) {
			nodeStack.push(node);
			node = node.left;
		}

		while (nodeStack.size() > 0) {
			BinaryTreeNode tmp = nodeStack.pop();
			l.add(tmp.data);//sum of Sum of k smallest elements in BST

			System.out.print(tmp.data + " ");
			if (tmp.right != null) {
				tmp = tmp.right;
				while (tmp != null) {
					nodeStack.push(tmp);
					tmp = tmp.left;
				}
			}
		}
		//Sum of k smallest elements in BST
		//http://www.geeksforgeeks.org/sum-k-smallest-elements-bst/
		while(k<4){
			sum+=l.get(k);
			k++;
		}
		System.out.println("sum "+sum);
	}

	public void preOrderIterative(BinaryTreeNode root) {
		BinaryTreeNode node = root;
		if (node == null) return;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			BinaryTreeNode tmp = stack.pop();
			System.out.print(tmp.data+" ");
			if (tmp.right != null)
				stack.push(tmp.right);
			if (tmp.left != null)
				stack.push(tmp.left);
		}
	}
	public void postOrderIterative(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack1 = new Stack<BinaryTreeNode>();
		BinaryTreeNode node = root;
		if (node == null) return;
		Stack<BinaryTreeNode> stack2 = new Stack<BinaryTreeNode>();
		stack1.push(node);
		while (!stack1.isEmpty()) {			
			BinaryTreeNode tmp = stack1.pop();
			stack2.push(tmp);			
			if (tmp.left != null)
				stack1.push(tmp.left);
			if (tmp.right != null)
				stack1.push(tmp.right);
		}
		while(!stack2.isEmpty()){
			BinaryTreeNode tmp1 = stack2.pop();
			System.out.print(tmp1.data+" ");
		}
	}
	public void levelOrderTraversalUsingQ(BinaryTreeNode root){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null)
			return;
		q.add(root);
		while(!q.isEmpty()){
			int size  =q.size();
			while(size>0){
				
			BinaryTreeNode tmp = q.poll();
			System.out.print(tmp.data+" ");
			if(tmp.left!=null) q.add(tmp.left);
			if(tmp.right!=null) q.add(tmp.right);
			size--;
			}
			System.out.println();
		}
	}

	public void levelOrderTraversal(BinaryTreeNode root){
	        int h = height(root);
	        int i;
	        for (i=1; i<=h; i++){
	            printGivenLevel(root, i);	            
	            
	        }
	    }
	private void printGivenLevel(BinaryTreeNode root, int level) {
		if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
        	printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
       
        }
        
		
	}

	
	public void levelOrderTraversalZigzag(BinaryTreeNode root){
        int h = height(root);
        boolean isTrue=false;
        int i;
        for (i=1; i<=h; i++){
            printGivenLevelZigzag(root, i,isTrue);
            isTrue=!isTrue;
        }
    }
	private void printGivenLevelZigzag(BinaryTreeNode root, int level, boolean isTrue) {
		if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
        	if(isTrue!=false){
        		printGivenLevelZigzag(root.left, level-1, isTrue);
            	printGivenLevelZigzag(root.right, level-1,isTrue);
        	} else{
        		printGivenLevelZigzag(root.right, level-1, isTrue);
            	printGivenLevelZigzag(root.left, level-1,isTrue);
        	}
        }
		
	}
	

	private int height(BinaryTreeNode root) {
		if(root == null) return 0;
		else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);
		//	return lHeight>rHeight ?lHeight+1 :rHeight+1;
			return (1+ Math.max(height(root.left),height(root.right)));
	}
	}
	public static void main(String[] args) {
		TreeTraversalIterative tree = new TreeTraversalIterative();
	//	BinaryTreeNode root = new BinaryTreeNode();
		tree.root = new BinaryTreeNode(20);
		tree.root.left = new BinaryTreeNode(8);
		tree.root.right = new BinaryTreeNode(22);
		tree.root.left.left = new BinaryTreeNode(4);
		tree.root.left.right = new BinaryTreeNode(12);
		tree.root.left.right.left = new BinaryTreeNode(10);
		tree.root.left.right.right = new BinaryTreeNode(14);
	//	tree.root.right.left = new BinaryTreeNode(6);
	//	tree.root.right.right = new BinaryTreeNode(7);
		System.out.println("In order traversal ");
		tree.inOrderIterative(tree.root);
		System.out.println();
		System.out.println("pre order traversal ");
		tree.preOrderIterative(tree.root);
		System.out.println();
		System.out.println("post order traversal ");
		tree.postOrderIterative(tree.root);
		System.out.println();
		System.out.println("Level order traversal ");
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Level order traversal Using Q ");
		tree.levelOrderTraversalUsingQ(tree.root);
		System.out.println();
		System.out.println("Level order traversal Zigzag way ");
		tree.levelOrderTraversalZigzag(tree.root);
		
}
}