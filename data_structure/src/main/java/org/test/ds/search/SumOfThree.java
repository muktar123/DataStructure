package org.test.ds.search;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class SumOfThree {
	static Set<Integer> find_triplets(int[] arr) {
		  Arrays.sort(arr);
		  Set<Integer>  triplets = new Set<Integer>() {
			
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		  Integer[] triplet= new Integer[3];
		  int n = arr.length;
		  for (int i = 0;i < n; i++) {
		    int j = i + 1;
		    int k = n - 1;
		    while (j < k) {
		      int sum_two = arr[i] + arr[j];
		      if (sum_two + arr[k] < 0) {
		        j++;
		      } else if (sum_two + arr[k] > 0) {
		        k--;
		      } else {
		        triplet[0] = arr[i];
		        triplet[1] = arr[j];
		        triplet[2] = arr[k];
		        triplets.add(triplet[0]);
		        triplets.add(triplet[1]);
		        triplets.add(triplet[2]);
		        j++;
		        k--;
		      }
		    }
		  }
		  return triplets;
		}
	public static void main(String[] args) {
		
	
	int[] a =  {-1, 0, 1, 2, -1, -4};
	Set<Integer> ss = new HashSet<Integer>();
	 ss =find_triplets(a);
	 
	 find_triplets(a).forEach(System.out::println);
	System.out.println(find_triplets(a));
}

}