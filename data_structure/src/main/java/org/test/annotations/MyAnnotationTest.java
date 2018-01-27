package org.test.annotations;


public class MyAnnotationTest {
	
	@MyAnnotation
	private int x=20;
	public void sayHello(){
		System.out.println("hello annotations");
		
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		MyAnnotationTest mt = new MyAnnotationTest();
		MyAnnotation ma =mt.getClass().getDeclaredField("x").getAnnotation(MyAnnotation.class);
	//	MyAnnotation m = mt.getClass().getMethod("sayHello").getDeclaredAnnotation(MyAnnotation.class);
		//MyAnnotation mmt = m.getAnnotation(MyAnnotation.class);
		
		System.out.println(ma.value());
	}

}
