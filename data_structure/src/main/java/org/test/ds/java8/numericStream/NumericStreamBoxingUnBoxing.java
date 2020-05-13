package org.test.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamBoxingUnBoxing {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10) //Int
                .boxed()//Integer
                // Input is int but Boxed() will convert it to Integer
                .collect(Collectors.toList()) ;
    }
    public static int unBoxing(List<Integer> integerList){
        return integerList.stream().mapToInt(Integer::intValue)
        .sum();
    }
    public static void main(String[] args) {
       List<Integer> integers =boxing();
       integers.forEach(x-> System.out.println(x));
        System.out.println(unBoxing(integers));

    }
}
