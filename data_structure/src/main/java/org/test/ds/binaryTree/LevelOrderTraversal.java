package org.test.ds.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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

	public ArrayList<ArrayList<Integer>> levelTraversal(BinaryTreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return res;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> curr = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			BinaryTreeNode tmp = q.poll();
			if (tmp != null) {
				curr.add(tmp.data);
				if (root.left != null)
					q.offer(tmp.left);
				if (root.right != null)
					q.offer(tmp.right);
			} else {
				ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();
				if (!q.isEmpty())
					q.offer(null);
			}
		}
		return res;

	}

	public void inOrder(BinaryTreeNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);

		}
	}

	public static void main(String[] args) {
		LevelOrderTraversal lot = new LevelOrderTraversal();
		BinaryTreeNode root = new BinaryTreeNode(6);
		lot.insert(root, 1);
		lot.insert(root, 2);
		lot.insert(root, 3);
		lot.insert(root, 4);
		lot.insert(root, 5);
		lot.insert(root, 6);
		lot.insert(root, 7);
		System.out.println("In order traversal ");
		//lot.inOrder(root);
		//System.out.println();
		System.out.println("Level order traversal ");
		lot.levelTraversal(root);
	}
}
