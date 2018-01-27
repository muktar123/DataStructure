package org.test.ds.binaryTree;

import java.util.HashSet;
import java.util.Set;

public class BTWithDeadEnd {
	
	public  static void storeNodes(BinaryTreeNode bt, Set<Integer> allNodes, Set<Integer> leafNode){
		
		if(bt==null) return;
		
		allNodes.add(bt.data);
		
		if(bt.left==null && bt.right==null){
			leafNode.add(bt.data);
		}

		storeNodes(bt.left, allNodes, leafNode);
		storeNodes(bt.right, allNodes, leafNode);
	}
	
	 boolean isDeadEnd(BinaryTreeNode root){
		if(root==null) return false;
	
	Set<Integer> allNodes = new HashSet<Integer>();
	Set<Integer> leaf = new HashSet<Integer>();
	storeNodes(root,allNodes,leaf);
	int x=0;
	for(int i=0;i<leaf.size();i++){
		if(allNodes.contains(x+i))
	}
	return false;
	
}
}

