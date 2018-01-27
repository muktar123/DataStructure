package org.test.ds.search;

public class MissingElementUsingXOR {
	
	public static int findMissingNumber(int[] aa){
		int i,X = 0,Y = 0, n=aa.length;
		for(i=0;i<n;i++){
			X^=aa[i];
		}
		for(i=0;i<n;i++){
			Y^=i;
		}
		return X^Y;
	}
	public static void main(String[] args) {
		int[] aa= {1,2,4,5,6};
		System.out.println(findMissingNumber(aa));
		
	}

}
