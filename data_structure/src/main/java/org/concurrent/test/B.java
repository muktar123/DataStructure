package org.concurrent.test;

public abstract class B {
	static int i=10;
	
	final B(){
		System.out.println("in constructor");
	}
	public void foo(){
		System.out.println("inside abstact class B");
	}

}
