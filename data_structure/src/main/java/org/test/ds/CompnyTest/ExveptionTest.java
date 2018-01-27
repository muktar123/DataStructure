package org.test.ds.CompnyTest;

import javax.management.RuntimeErrorException;

public class ExveptionTest {

	public void m1() throws Exception{
		try{
			m2();
		}
		finally{
			m3();
		}
	}

	private void m3()throws RuntimeException {
		throw new RuntimeErrorException();
		
	}

	private void m2()throws RuntimeException {
		// TODO Auto-generated method stub
		
	}
}
