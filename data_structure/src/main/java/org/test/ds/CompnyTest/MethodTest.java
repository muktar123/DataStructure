package org.test.ds.CompnyTest;

public class MethodTest {

	public static void main(String[] args) {
		callType(10);
	}

	private static void callType(int i) {
		System.out.println("number passed");
		
	}
	private static void callType(Object i) {
		System.out.println("Object passed");
		
	}
	
}
