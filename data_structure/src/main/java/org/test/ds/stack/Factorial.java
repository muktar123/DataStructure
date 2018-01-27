package org.test.ds.stack;

public class Factorial {
	
	public long fact(int n){
		if(n==0 || n==1) return 1;
		System.out.println("hi");
	//	if(n==3) System.exit(-2);
		return n*fact(n-1);
		
	}
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.fact(4));
		
	}

}
