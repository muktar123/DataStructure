package org.test.methodRef;

import java.util.function.Function;

public class FunMethodReference {
    static Function<String, String> stringStringFunction = (s) -> s.toUpperCase();
    static Function<String, String> stringStringFunction1 = String::toUpperCase;


    public static void main(String[] args) {
        System.out.println(stringStringFunction.apply("Hello"));
        System.out.println(stringStringFunction1.apply("Hello"));

    }

}
