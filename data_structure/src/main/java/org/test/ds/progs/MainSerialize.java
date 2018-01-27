package org.test.ds.progs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerialize {
	
	public static void serialize(Object obj,String fileName) throws IOException{
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream os = new ObjectOutputStream(fos); 
		os.writeObject(obj);
		fos.close();
				
		
	}
	
	public static Object deSerialize(String fileName) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream is = new ObjectInputStream(fis);
		EmployeeSerializable emp = (EmployeeSerializable) is.readObject();
		//System.out.println(emp.getName());
		return emp;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeSerializable es = new EmployeeSerializable();
		es.setId(1);es.setName("Muktar"); es.setSalary(5000000);		
		MainSerialize.serialize(es,"abcFile");
		
		EmployeeSerializable emp = (EmployeeSerializable) MainSerialize.deSerialize("abcFile");
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}

}
