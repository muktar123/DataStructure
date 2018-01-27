package org.test.ds.dp;

import java.util.Arrays;
import java.util.Date;

public class FibonaciRecursive {
	//static long[] fibArray=new long[50];
	public static  long fibonaciRecursive(int n){
		long[] fibArray = new long[n+1];
		/*long fibVal=0;
	//	Arrays.fill(fibArray, -1);
		if(n==0) return 0;
		if(n==1) return 1;
		
		if(fibArray[n]!=0){
			return fibArray[n];
		}else{
		fibVal= fibonaciRecursive(n-1)+fibonaciRecursive(n-2);
		System.out.println(fibVal);
		}
		return fibArray[n];
		//return fibonaciRecursive(n-1)+fibonaciRecursive(n-2);
*/			
		long fibValue=0;
		fibArray[0]=0;fibArray[1]=1;
		 for(int i=2;i<=n;i++){
		   fibArray[i]=fibArray[i-1]+fibArray[i-2];
		  
	}
		 return fibArray[n];
	}
	public static long fibonaciIterative(int n){
		long f1=0;
		long f2=1;
		long f=0;
			for(int i=2;i<=n;i++){
				f=f1+f2;
				f1=f2;
				f2=f;
		}
			return f;
	}
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(fibonaciRecursive(7));
		System.out.println(new Date());
	//	System.out.println(fibonaciIterative(60));
		System.out.println(new Date());
	}//
}
