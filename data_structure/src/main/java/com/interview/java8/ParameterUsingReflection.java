package com.interview.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterUsingReflection {
	
	public void foo(String x){
		System.out.println(x+" ");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method method = ParameterUsingReflection.class.getMethod("foo", String.class);
		for(Parameter parameter:method.getParameters())
			System.out.println(parameter.getName());
	}

}
