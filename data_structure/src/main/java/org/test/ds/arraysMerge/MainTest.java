package org.test.ds.arraysMerge;

public class MainTest {
	
	public void foo() throws InterruptedException{
		boolean f= true;
		int cnt=0;
		while(f){
			System.out.println("hi");
			Thread.sleep(1000);
			if(cnt==5000){
				f=false;
			}
			cnt++;
			
		}
	}
	public static void main(String[] args) {
		
		MainTest mt= new MainTest();
		try {
			mt.foo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
