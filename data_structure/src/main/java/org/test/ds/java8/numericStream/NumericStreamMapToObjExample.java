package org.test.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamMapToObjExample {

    public static void mapToObj(){
        Stream<Object> xx =IntStream.rangeClosed(1,50).mapToObj(x-> new Integer(x));
        xx.forEach(x-> System.out.print(x+","));
       //OR
        List<Integer> integerList = IntStream.rangeClosed(1,50).mapToObj(x-> new Integer(x))
                .collect(Collectors.toList());
        System.out.println();
        integerList.forEach(x-> System.out.print(x+","));
    }
    public static void mapToLong(){
       Long aLong= IntStream.rangeClosed(1,50).mapToLong(i->i).sum();
        System.out.println(aLong);
    }
    public static void main(String[] args) {
        mapToObj();
        mapToLong();

    }
}
