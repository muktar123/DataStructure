package org.test.ds.arrayTest;

public class MultipleOf3And5 {
	
	int sum=0;	
	public void multiple(int n){
		
		for(int  i=0;i<n;i++){
			
			if(i%3==0 || i%5==0) {
				
				sum+=i;
			//	System.out.println(i+"is: " +sum);
			}
			
		/*	if(i%3 ==0 && i%5==0)
				sum+=i;*/
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		MultipleOf3And5 mul = new MultipleOf3And5();
		mul.multiple(20);
	}
}
