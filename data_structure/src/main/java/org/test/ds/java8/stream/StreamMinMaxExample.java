package org.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integers) {
        return integers.stream().reduce(0, (a, b) -> a > b ? a : b);
    }
    public static Optional<Integer> findMaxValueWithoutIdentity(List<Integer> integers) {
        return integers.stream().reduce((a, b) -> a > b ? a : b); //without default identity
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 80, 9, 10);
        List<Integer> list = new ArrayList<>();
        System.out.println(findMaxValue(integerList)); //empty list should return null, but returning identity
        Optional<Integer> optionalInteger =findMaxValueWithoutIdentity(integerList);
        if(optionalInteger.isPresent())
            System.out.println(optionalInteger.get()); //Return Optional.empty
        else{
            System.out.println("Value not found");
        }
    }
}
