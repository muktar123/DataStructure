package org.test.ds.CompnyTest;

class A{
	public A(){
		
	}
	public A(int a){
		this();
	}
} 
class B extends A{
	public boolean B(String msg){
		return false;
	}
}
class C extends B{
	private C(){
		super();
	}
	public C(String msg){this();}
	public C(int i){}
}
public class ClassTest {
public static void main(String[] args) {
	A c = new B();
	
}
}
