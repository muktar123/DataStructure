package org.test.ds.binaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class DistanceRootToNode {
	 public static ArrayList path =new ArrayList();;
	 static int y=0;
	 static int sum=0;
	public int Pathlength(BinaryTreeNode root, int n1) {
		int x = 0;
		if (root != null) {
			
			if ((root.data == n1) || (x = Pathlength(root.left, n1)) > 0
					|| (x = Pathlength(root.right, n1)) > 0) {

				path.add(root.data);//nodes of the path
				sum+=root.data;//sum of the path
			//	y=y+1;//distance of 
				return x + 1;
				

			}
			return 0;
		}
		return 0;
	}
	public Boolean  getPath(BinaryTreeNode root, int n1) {
	
		if (root != null) {
			
			if ((root.data == n1) ||getPath(root.left, n1) || getPath(root.right, n1)) {
				path.add(root.data);//nodes of the path
				sum+=root.data;//sum of the path
				y=y+1;//distance of the path
				return true;
			}
			
			
		}
		return false;
	}

	public static void main(String[] args) throws java.lang.Exception {
		BinaryTreeNode root = new BinaryTreeNode(5);
		root.left = new BinaryTreeNode(10);
		root.right = new BinaryTreeNode(15);
		root.left.left = new BinaryTreeNode(20);
		root.left.right = new BinaryTreeNode(25);
		root.right.left = new BinaryTreeNode(30);
		root.right.right = new BinaryTreeNode(35);
		root.left.right.right = new BinaryTreeNode(45);
		DistanceRootToNode i = new DistanceRootToNode();
		System.out.println("Distance from root to 45 is : "
				+ (i.Pathlength(root, 45)-1));
		//i.getPath(root, 45);
		Collections.reverse(path);
		System.out.println("Path : "+path); 
	//	System.out.println("Distance from root to 45 is "+(y-1));
		System.out.println("sum of path is "+sum);
	}
}
