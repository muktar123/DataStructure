package org.test.ds.progs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B extends A implements Serializable{
	
	public static void foo(){
		System.out.println("class B static method");
	}
	
	public void foo1(){
		System.out.println("class B without static");
	}
	public void foo2(){
		System.out.println("class B without static foo2");
	}
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(1);
		list.add(0);
		list.add(0);list.add(0);
		list.removeAll(Collections.singleton(0));
		//Set set = new HashSet(list);
		System.out.println(list);
		int aa=(Integer)list.get(0)/5;
		System.out.println(aa);
		
		A a =new B();
		a.foo();
	//	a.foo1();
	//	((B) a).foo2();
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
