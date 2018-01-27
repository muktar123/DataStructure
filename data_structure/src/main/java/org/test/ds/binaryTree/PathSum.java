package org.test.ds.binaryTree;

import javax.swing.tree.TreeNode;

public class PathSum {
	public boolean hasPathSum(BinaryTreeNode root, int sum) {
		if (root == null)
			return false;
		if (root.data == sum && (root.left == null && root.right == null))
			return true;
	 
		return hasPathSum(root.left, sum - root.data)
				|| hasPathSum(root.right, sum - root.data);
	}

}
