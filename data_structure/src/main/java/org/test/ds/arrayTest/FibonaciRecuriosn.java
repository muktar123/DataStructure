package org.test.ds.arrayTest;

import java.util.Arrays;
import java.util.Date;

public class FibonaciRecuriosn {

	public static int fibonaciRecursion(int n){
		if(n<=1) return n;
	//	if(n==1) return 1;
		return fibonaciRecursion(n-1) + fibonaciRecursion(n-2);
	}
	//faster compare to recursion
	public static int fibonaciIterative(int n){
		int first=0;
		int second=1;
		int f=1;
		for(int i=2;i<=n;i++){
		 f= first+second;
		first=second;
		second=f;
		//return f;
		}
		return f;
	}
	public static int fibonaciMemoization(int n){
		int[] fib = new int[n+1];
		fib[0]=0;
		fib[1]=1;
		Arrays.fill(fib, -1);
		
		if(fib[n]>-1){
			return fib[n];
		}
		 for (int i = 2; i <= n; i++)
		    {
			 fib[i] =fib[i-1]+fib[i-2];
			
		    }
		 return fib[n];
	}
	public static void main(String[] args) {
	System.out.println(new Date());
		System.out.println(fibonaciRecursion(40));
		System.out.println(new Date());
	//	System.out.println(fibonaciIterative(40));
		System.out.println(fibonaciMemoization(5));
		System.out.println(new Date());
	}
}
// 0 1 1 2  3