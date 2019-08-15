package org.test.dp;

import java.util.Date;

public class FibonacciSeries {
	
	public static long getFibonaciNumber(long n) {
		if(n<=1) return n;
		return getFibonaciNumber(n-1) + getFibonaciNumber(n-2);
		
	}
	public static long getFibonaciNumberUsingDP(int n) {
		long result[] = new long[n+1];
		result[0] = 0;
		result[1] = 1;
		if(n<=1) return n;
		for (int i = 2; i <=n;i++) {
			result[i] =  result[i-1] + result[i-2];
		}
		return result[n];
		
	}
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(getFibonaciNumberUsingDP(45));
		System.out.println(new Date());
		
		System.out.println(new Date());
		System.out.println(getFibonaciNumber(45));
		System.out.println(new Date());

	}

}
