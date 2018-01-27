
package org.test.ds.CompnyTest;

public class Overloaded {

	static void overLoaded(Object o){
		System.out.println("overloaded object");
	}
	static void overLoaded(String o){
		System.out.println("overloaded String");
	}
	static void overLoaded(Integer o){
		System.out.println("overloaded Integer");
	}
	static<T> void generic(T o){
		overLoaded(o);
		//System.out.println("overloaded object");
	}
	public static void main(String[] args) {
		String s = new String("abc");
		generic(s);
		generic(1);
	}
}
