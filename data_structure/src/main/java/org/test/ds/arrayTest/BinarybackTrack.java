package org.test.ds.arrayTest;

public class BinarybackTrack {
	
	static int[] A ={1,4,5,6,2};
	public void binary(int n){
		if(n<1)
			System.out.println(A.toString());
		else{
			A[n-1]=0;
			binary(n-1);
			A[n-1] =1;
			binary(n-1);
		}
	}
	public static void main(String[] args) {
		BinarybackTrack bb = new BinarybackTrack();
		bb.binary(A.length);
	}

}
