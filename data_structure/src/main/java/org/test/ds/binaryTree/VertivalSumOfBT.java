package org.test.bt;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VertivalSumOfBT {

	static TreeMap<Integer, Integer> map = new TreeMap();

	public static void getVerticalOrder(BTree root, int level) {
		if (root == null)
			return;

		if (map.containsKey(level)) {
			int x = map.get(level);
			
			map.put(level, x+root.data);
		} else {

			map.put(level, root.data);
		}
		getVerticalOrder(root.left, level - 1);
		getVerticalOrder(root.right, level + 1);

	}

	public static void printResult(TreeMap ht) {
		Set<Integer> i = ht.keySet();
		for (int keys : i) {
			System.out.println("Level " + keys + " Sum : " + ht.get(keys));
		}
	}

	public static void main(String[] args) {
		BTree root = new BTree(1);
		root.left = new BTree(2);
		root.right = new BTree(3);
		root.left.left = new BTree(4);
		root.left.right = new BTree(5);
		root.right.left = new BTree(6);
		root.right.right = new BTree(7);
		getVerticalOrder(root, 0);
		printResult(map);
	}

}
