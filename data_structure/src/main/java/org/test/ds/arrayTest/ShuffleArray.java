package org.test.ds.arrayTest;

public class ShuffleArray {
	
	public static void shuffleArray(char A[],int l,int r){
		int c =(l+r)/2;
		int q=1+(l+c)/2;
		if(l==r) return;
		for(int k=1,i=q;i<=c;i++,k++){
			char tmp = A[i];
			A[i] =A[c+k];
			A[c+k] = tmp;
		}
		shuffleArray(A,l,c);
		shuffleArray(A,c+1,r);
	}
	public static void print(char A[]){
		for(int i=0;i<A.length-1;i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
		char[] AA ={'a1','a2','a3','a4','b1','b2','b3','b4',0};
	//	char[] A ="a1a2a3a4b1b2b3b4".toCharArray();

		shuffleArray(A, 0, A.length);
		print(A);
	}

}
