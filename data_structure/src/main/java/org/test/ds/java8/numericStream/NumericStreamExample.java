package org.test.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfIntegers(List<Integer> integerList){
        return integerList.stream().reduce(0, (x,y)-> x+y);//Unboxing Integer to int how to avoid??

    }
    public static int sumOfIntegersUsingIntStream(){
        return IntStream.rangeClosed(1,5).sum();

    }
    public static void main(String[] args) {
        List<Integer> integers =Arrays.asList(1,2,3,4,5);
        System.out.println(sumOfIntegers(integers));
        System.out.println(sumOfIntegersUsingIntStream());

    }
}
