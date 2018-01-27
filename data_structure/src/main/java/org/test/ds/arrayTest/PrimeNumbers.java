package org.test.ds.arrayTest;

public class PrimeNumbers {
	
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		int num=2;
		int cnt=0;
		while(cnt<10){
			if(isPrime(num)){
				cnt++;
				System.out.println(num);
			}
			
			num++;
			
		}
		
	}

}
