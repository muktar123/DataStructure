package org.test.functions;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> stringFunction =(name) -> name.toUpperCase();
    static Function<String, String> stringFunction1 =(name) -> name.toUpperCase().concat("default");


    public static void main(String[] args) {
        System.out.println(stringFunction.apply("Ali%"));
        System.out.println(stringFunction.andThen(stringFunction1).apply("Mukhtar"));
        System.out.println(stringFunction.compose(stringFunction1).apply("Mukhtar"));


    }
}
