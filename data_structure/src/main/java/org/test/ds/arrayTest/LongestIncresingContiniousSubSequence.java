package org.test.ds.arrayTest;

public class LongestIncresingContiniousSubSequence {
	
	public static int getLongestContSubSeq(int[] a){
		int cnt=1;
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1]){
				cnt++;
			}else{
				cnt=1;
			}
			
		}
		return cnt++;
	}
	public static void main(String[] args) {
		int[] aa={7,2,5,6,3};
		System.out.println(getLongestContSubSeq(aa));
	}

}
