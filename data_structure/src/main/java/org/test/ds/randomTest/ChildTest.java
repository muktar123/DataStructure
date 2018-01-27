package org.test.ds.randomTest;

public class ChildTest extends ParentTest {

	public int x=1;
	
	public void print(){
		System.out.println("Child test");
	}
	public static void main(String[] args) {
		ParentTest pt = new ChildTest();
		System.out.println(pt.x);
		pt.print();
	}
}
