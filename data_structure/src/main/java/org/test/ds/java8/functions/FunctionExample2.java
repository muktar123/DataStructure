package org.test.functions;

public class FunctionExample2 {

    public static String perform(String str){
        return FunctionExample.stringFunction1.apply(str);
    }

    public static void main(String[] args) {
    String result = perform("Hello");
        System.out.println(result);
    }

}
