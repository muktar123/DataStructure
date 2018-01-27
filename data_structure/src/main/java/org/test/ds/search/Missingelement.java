package org.test.ds.search;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Missingelement {

	public static void getMissingItem(int[] a) {

		Hashtable table = new Hashtable<Integer, Integer>();
		int cnt = 0;
		// int x=0;
		for (int i = 0; i < a[a.length-1]; i++)
			table.put(i + 1, 0);
		for (int x : a) {
			if (table.containsKey(x))
				table.put(x, ++cnt);
		}
		Set<Entry<Integer, Integer>> entrySet = table.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == 0) {
				System.out.println("missing element from array : "
						+ entry.getKey());
			}

		}
		// return cnt;
	}
	public static int singleMissing(int[] a){
		
		int m=6;
		m^=m;
		System.out.println(m);
		int missing=a[0];
		for(int i=0;i<a.length;i++)
			missing^=a[i];
		
		return missing;
	}

	public static void main(String[] args) {
		int[] aa = { 1, 2, 4, 5, 6, 10 };
		getMissingItem(aa);
		
		int[] a = { 1, 1, 2, 2, 3};
		System.out.println(singleMissing(a));
	}

}
