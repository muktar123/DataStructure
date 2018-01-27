package org.test.ds.stack;

public class SumUsingBitwise {
	int add(int a, int b) {
		 if (b == 0) return a;
		 int sum = a ^ b;// add without carrying
		 int carry= (a & b) << 1; // carry, but don't add
	
		
		 return add(sum, carry); // recurse with sum + carry
		 }
	public static void main(String[] args) {
		SumUsingBitwise sb = new SumUsingBitwise();
		System.out.println(sb.add(51, 80));
	}
}
