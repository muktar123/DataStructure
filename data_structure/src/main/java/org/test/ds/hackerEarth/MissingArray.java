package org.test.ds.hackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingArray {
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		Object[] aa =a.toArray();
		Integer[] c = (Integer[])aa;
		Arrays.sort(aa);
		for(int i=0;i<a.size()-1;i++){
			if(a.get(i)==a.get(i+1)){
				System.out.println(a.get(i));
			}
			
		}
		for(int j=0;j<c[c.length-1];j++){
				
			
		}
	}
}
