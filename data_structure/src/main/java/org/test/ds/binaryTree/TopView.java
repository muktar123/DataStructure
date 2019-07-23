package org.test.bt;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

class QueueObject{
	BTree node;
	int  level;
	public QueueObject(BTree root,int level) {
		this.level =level;
		this.node =root;
	}
}

public class TopView {
	public void topView(BTree root) {

		Queue<QueueObject> q = new LinkedList<QueueObject>();
		TreeMap<Integer, Integer> map = new TreeMap();
		if(root==null) return;
		q.add(new QueueObject(root,0));
		while(!q.isEmpty()) {
			QueueObject tmpBTree = q.poll();
			BTree btree = tmpBTree.node;
			int  level = tmpBTree.level;

			if(!map.containsKey(level)) {
				map.put(level, btree.data);
			}

			if (btree.left != null) { 
                q.add(new QueueObject(btree.left, level - 1)); 
            } 
            if (btree.right != null) { 
                q.add(new QueueObject(btree.right, level + 1)); 
            } 
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) { 
            System.out.print(entry.getValue()+" "); 
        } 
    } 
	
	public void topView1(int ds,BTree root, int level) {
	
			Queue<QueueObject> q = new LinkedList<QueueObject>();
			TreeMap<Integer, Integer> map = new TreeMap();
			if(root==null) return;
				q.add(new QueueObject(root, 0));
				while(!q.isEmpty()) {
					QueueObject qb = q.poll();
					BTree node = qb.node;
					int d =qb.level;
					if(!map.containsKey(d)) {					
						map.put(d, node.data);
					}
					
			        if (node.left!=null) 
			        	q.add(new QueueObject(node.left,d-1));
			        
			        if (node.right!=null) 
			        	q.add(new QueueObject(node.right,d+1));
					}
			
			for (Entry<Integer, Integer> entry : map.entrySet()) { 
	            System.out.println(" Level : "  +entry.getKey() +" And value is :"+entry.getValue()); 
	        } 
	    } 
	
	void topView2(BTree root) {
		{
		    if (root == null) {
		        return;
		    }
		    Stack<BTree> stack = new Stack<BTree>();
		    BTree cur = root.left;
		    while (cur != null) {
		        stack.push(cur);
		        cur = cur.left;
		    }
		    while (!stack.isEmpty()) {
		        System.out.print(stack.pop().data + " ");
		    }
		    System.out.print(root.data + " ");
		    cur = root.right;
		    while (cur != null) {
		        System.out.print(cur.data + " ");
		        cur = cur.right;
		    }
		}
	}
      
    // Driver Program to test above functions 
    public static void main(String[] args)  
    {  
        /* Create following Binary Tree  
            1  
        / \  
        2 3  
        \  
            4  
            \  
            5  
            \  
                6*/
    	BTree root = new BTree(1); 
        root.left = new BTree(2); 
        root.right = new BTree(3); 
        root.left.right = new BTree(4); 
        root.left.right.right = new BTree(5); 
        root.left.right.right.right = new BTree(6); 
        System.out.println("Following are BTrees in top view of Binary Tree");  
        TopView tv = new TopView();
        tv.topView1(0,root,0);  
        tv.topView(root);
	}
		
	
	

}
