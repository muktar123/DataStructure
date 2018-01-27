package org.test.ds.dynamic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Arrays.asList( "a", "b", "d" ).sort(( e1,e2) -> e1.compareTo(e2));
			System.out.print( e +" ");
			System.out.print( e +" ");
			} );
		/*A a = new A("Ansary");
		MainTest st = new MainTest("Ali",a);
		FileOutputStream fo = new FileOutputStream("D:\\serializtionFile1");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(st);
		//fo.write(25);
*/		
		FileInputStream fis = new FileInputStream("D:\\serializtionFile1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MainTest mt = (MainTest) ois.readObject();
		System.out.println(mt.getName());

	}

}

class MainTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name ;

	private A a;

	MainTest(String name1, A a) {
		this.setName(name1);
		this.a=a;
		System.out.println("test");
	}

	public String getName() {
		return name;
	}
	/* private void writeObject(ObjectOutputStream out) throws IOException {
		 System.out.println("test method");
		 setName("Jammy");
		    out.defaultWriteObject();
		  }

		  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		    in.defaultReadObject();
		  }*/

	public void setName(String name) {
		this.name = name;
	}

}
class A implements Serializable{
	
private int B;
	A(String name1,int B) {
		name1="Hi";
		B=10;
		
	}
	
}
