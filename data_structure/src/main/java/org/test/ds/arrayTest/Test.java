package org.test.ds.arrayTest;

public class Test {
	public static void main(String[] args) {
		
	
	 final StringBuffer sbf=new StringBuffer("A");
	sbf.append("B");
	System.out.println(sbf);  // —>1
	callme(sbf);
	System.out.println(sbf); //  —>2
	}
	public static void callme(StringBuffer sbf){
	sbf.append("X");
	System.out.println(sbf); // —->3
	}
	
}
